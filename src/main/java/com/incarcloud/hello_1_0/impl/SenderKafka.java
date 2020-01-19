package com.incarcloud.hello_1_0.impl;

import com.incarcloud.hello_1_0.kafka.KafkaSender;
import com.incarcloud.hello_1_0.structure.Sender;
import com.incarcloud.std.HelloV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.BiConsumer;

/**
 * 数据发送器
 */
@Service
public class SenderKafka implements Sender {

    @Autowired
    private KafkaSender kafkaSender;
    @Value("${spring.kafka.producer.topic}")
    private String topic;
    /**
     * 同步发送
     * @param data
     * @return
     */
    public HelloV.HelloResponseV1 sendSync(HelloV data){
        return null;
    }

    /**
     * 异步发送
     * @param data
     * @param callback
     */
    public void sendAsync(HelloV data, BiConsumer<HelloV.HelloRequestV1, Exception> callback){

    }

    /**
     * 同步发送(批量)
     * @param dataList
     * @return
     */
    public HelloV.HelloResponseV1 sendSyncBatch(List<HelloV.HelloRequestV1> dataList){
        return null;
    }

    /**
     * 异步发送(批量)
     * @param dataList
     * @param callback
     */
    public void sendAsyncBatch(List<HelloV.HelloRequestV1> dataList, BiConsumer<List<HelloV.HelloResponseV1>, Exception> callback){
        for(HelloV.HelloRequestV1 request : dataList){
            byte[] bytes = request.toByteArray();
            kafkaSender.send(topic, bytes);
        }
    }
}
