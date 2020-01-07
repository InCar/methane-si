package com.incarcloud.hello_1_0.structure;

/**
 * 命令接收器
 */
public interface Receiver {

    /**
     * 接收cmd
     * @param data
     */
    void receive(Object data);
}
