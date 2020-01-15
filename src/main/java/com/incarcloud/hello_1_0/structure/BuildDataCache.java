package com.incarcloud.hello_1_0.structure;

import com.incarcloud.std.HelloV;

import java.util.List;

/**
 * 模拟数据缓存(注意线程安全问题)
 */
public interface BuildDataCache {
    /**
     * 存入模拟数据
     * @param dataList
     */
    void put(List<HelloV> dataList);

    /**
     * 拿走模拟数据
     * @return
     */
    List<HelloV> take();
}
