package com.incarcloud.hello_1_0.structure;

/**
 * 性能指标收集器
 */
public interface Collector {
    /**
     * 采集构造的数据
     * @param num
     */
    void collectBuildData(int num);

    /**
     * 采集发送成功的数据
     * @param num
     */
    void collectSendDataSucceed(int num);

    /**
     * 采集发送失败的数据
     * @param num
     */
    void collectSendDataFailed(int num);

    /**
     * 采集响应延时
     * @param num
     * @param delay
     */
    void collectResponseDelay(int num, long delay);
}
