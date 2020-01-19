package com.incarcloud.hello_1_0.structure;

import com.incarcloud.std.HelloV;

import java.util.List;

/**
 * 构造模拟数据任务
 */
public class BuildDataTask implements Runnable{
    DataBuilder dataBuilder;
    Object[] exts;
    BuildDataCache buildDataCache;
    Collector collector;

    public BuildDataTask(DataBuilder dataBuilder, BuildDataCache buildDataCache, Collector collector, Object ...exts) {
        this.dataBuilder = dataBuilder;
        this.buildDataCache=buildDataCache;
        this.collector=collector;
        this.exts=exts;
    }

    @Override
    public void run() {
        List<HelloV.HelloRequestV1> dataList= dataBuilder.build(exts);
        buildDataCache.put(dataList);
        collector.collectBuildData(dataList.size());
    }
}
