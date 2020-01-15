package com.incarcloud.hello_1_0.structure;

import com.incarcloud.std.HelloV;

import java.util.List;

public class SendDataTask implements Runnable{
    Sender sender;
    BuildDataCache buildDataCache;
    Collector collector;

    public SendDataTask(Sender sender, BuildDataCache buildDataCache, Collector collector) {
        this.sender = sender;
        this.buildDataCache = buildDataCache;
        this.collector = collector;
    }

    @Override
    public void run() {
        List<HelloV> dataList= buildDataCache.take();
        sender.sendAsyncBatch(dataList,(e1,e2)->{
            long succeedNum=e1.stream().filter(e->e.getRes()==1).count();
            long failedNum=e1.size()-succeedNum;
            collector.collectSendDataSucceed((int)succeedNum);
            collector.collectSendDataFailed((int)failedNum);
        });
    }
}
