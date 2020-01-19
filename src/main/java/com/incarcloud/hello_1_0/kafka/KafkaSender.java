package com.incarcloud.hello_1_0.kafka;

import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class KafkaSender {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaSender.class);

    @Autowired
    private Producer<String, byte[]> producer;

    public void send(byte[] message) {
        try {
            producer.send(new ProducerRecord<>("ship", message));
        }catch (Exception e){
            e.printStackTrace();
            LOGGER.error("KafkaSender send error!", e);
        }
    }

    //发送消息方法
    public MqSendResult send(String topic, byte[] message) {
        MqSendResult mqSendResult = new MqSendResult(null, null);

        try {
            producer.send(new ProducerRecord<>(topic, message), new Callback() {
                @Override
                public void onCompletion(RecordMetadata metadata, Exception ex) {
                    if (ex != null) {
                        ex.printStackTrace();
                        LOGGER.error("KafkaSender send onCompletion error!", ex);
                        mqSendResult.setException(new MQException(ex.getMessage()));
                    } else {
                        LOGGER.info("KafkaSender send onCompletion " + metadata.offset());
                        mqSendResult.setData(metadata.offset());
                    }
                }
            });
        }catch (Exception e){
            e.printStackTrace();
            LOGGER.error("KafkaSender send error!", e);
        }
        return mqSendResult;
    }
}