package com.incarcloud.hello_1_0.structure;

import java.util.List;

/**
 * 重发数据缓存(注意线程安全问题)
 */
public interface RetrySendDataCache {
    /**
     * 存入重发数据
     * @param dataList
     */
    void put(List<RetryData> dataList);

    /**
     * 拿走重发数据
     * @return
     */
    List<RetryData> take();
}
