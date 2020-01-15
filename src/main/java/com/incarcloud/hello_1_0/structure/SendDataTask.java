package com.incarcloud.hello_1_0.structure;

import com.incarcloud.std.HelloV;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 发送数据任务
 */
public class SendDataTask implements Runnable{
    Sender sender;
    BuildDataCache buildDataCache;
    RetrySendDataCache retrySendDataCache;
    Collector collector;

    public SendDataTask(Sender sender, BuildDataCache buildDataCache,RetrySendDataCache retrySendDataCache, Collector collector) {
        this.sender = sender;
        this.buildDataCache = buildDataCache;
        this.retrySendDataCache=retrySendDataCache;
        this.collector = collector;
    }

    @Override
    public void run() {
        List<HelloV> dataList= buildDataCache.take();
        long t1=System.currentTimeMillis();
        sender.sendAsyncBatch(dataList,(e1,e2)->{
            //收集发送延时
            collector.collectResponseDelay(e1.size(),System.currentTimeMillis()-t1);
            //收集发送成功/失败数量
            long succeedNum=e1.stream().filter(e->e.getRes()==1).count();
            long failedNum=e1.size()-succeedNum;
            collector.collectSendDataSucceed((int)succeedNum);
            collector.collectSendDataFailed((int)failedNum);
            //如果重发缓存不为空,则失败记录加入到重发缓存
            if(retrySendDataCache!=null){
                List<RetryData> curList=new ArrayList<>();
                for(int i=0;i<=e1.size()-1;i++){
                    HelloV.HelloResponseV1 responseV1= e1.get(i);
                    if(responseV1.getRes()!=1){
                        RetryData retryData= new RetryData(dataList.get(i));
                        curList.add(retryData);
                    }
                }
                retrySendDataCache.put(curList);
            }
        });
    }
}
