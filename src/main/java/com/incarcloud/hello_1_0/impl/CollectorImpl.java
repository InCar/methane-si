package com.incarcloud.hello_1_0.impl;

import com.incarcloud.hello_1_0.structure.Collector;
import org.springframework.stereotype.Service;

/**
 * 性能指标收集器
 */
@Service
public class CollectorImpl implements Collector {
    /**
     * 采集构造的数据
     * @param num
     */
    public void collectBuildData(int num){

    }

    /**
     * 采集发送成功的数据
     * @param num
     */
    public void collectSendDataSucceed(int num){

    }

    /**
     * 采集发送失败的数据
     * @param num
     */
    public void collectSendDataFailed(int num){

    }

    /**
     * 采集响应延时
     * @param num
     * @param delay
     */
    public void collectResponseDelay(int num, long delay){

    }
}
