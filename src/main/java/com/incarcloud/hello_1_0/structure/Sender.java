package com.incarcloud.hello_1_0.structure;


import com.incarcloud.std.HelloV;

import java.util.List;
import java.util.function.BiConsumer;

/**
 * 数据发送器
 */
public interface Sender {
    /**
     * 同步发送
     * @param data
     * @return
     */
    HelloV.HelloResponseV1 sendSync(HelloV data);

    /**
     * 异步发送
     * @param data
     * @param callback
     */
    void sendAsync(HelloV data, BiConsumer<HelloV.HelloRequestV1, Exception> callback);

    /**
     * 同步发送(批量)
     * @param dataList
     * @return
     */
    HelloV.HelloResponseV1 sendSyncBatch(List<HelloV> dataList);

    /**
     * 异步发送(批量)
     * @param dataList
     * @param callback
     */
    void sendAsyncBatch(List<HelloV> dataList, BiConsumer<List<HelloV.HelloResponseV1>, Exception> callback);
}
