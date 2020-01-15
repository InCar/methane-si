package com.incarcloud.hello_1_0.structure;

import com.incarcloud.std.HelloV;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 重发数据任务
 */
public class RetrySendDataTask implements Runnable{

    RetrySendDataCache retrySendDataCache;
    Collector collector;
    Sender sender;

    public RetrySendDataTask(Sender sender,RetrySendDataCache retrySendDataCache, Collector collector) {
        this.sender = sender;
        this.retrySendDataCache = retrySendDataCache;
        this.collector=collector;
    }

    @Override
    public void run() {
        //获取重发缓存数据
        List<RetryData> retryList= retrySendDataCache.take();
        //转换为发送数据,并在重发次数上+1
        List<HelloV> dataList= retryList.stream().map(e->{
            e.getTime().incrementAndGet();
            return e.getData();
        }).collect(Collectors.toList());
        //发送数据
        long t1=System.currentTimeMillis();
        sender.sendAsyncBatch(dataList, (e1, e2)->{
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
                        RetryData retryData= retryList.get(i);
                        curList.add(retryData);
                    }
                }
                retrySendDataCache.put(curList);
            }
        });
    }
}
