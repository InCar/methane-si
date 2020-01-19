package com.incarcloud.hello_1_0;

import com.incarcloud.hello_1_0.structure.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 模拟器容器启动入口
 */
@Component
public class Context implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(Context.class);

    @Autowired(required = false)
    TaskScheduler taskScheduler;
    @Autowired(required = false)
    DataBuilder dataBuilder;
    @Autowired(required = false)
    Sender sender;
    @Autowired(required = false)
    BuildDataCache buildDataCache;
    @Autowired(required = false)
    RetrySendDataCache retrySendDataCache;
    @Autowired(required = false)
    Collector collector;

    @Value("${server.sendInterval}")
    private Integer sendInterval;

    private ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

    @Override
    public void run(String... args) throws Exception {
        if(taskScheduler!=null) {
            scheduledExecutorService.scheduleAtFixedRate(()->{
                LOGGER.info("task run...");
                if (dataBuilder != null&&buildDataCache!=null&&collector!=null) {
                    taskScheduler.scheduleNextBuildData(new BuildDataTask(dataBuilder,buildDataCache,collector));
                }
                if (sender != null&&buildDataCache!=null&&collector!=null) {
                    taskScheduler.scheduleNextSendData(new SendDataTask(sender,buildDataCache,retrySendDataCache,collector));
                }
                if (sender!=null&&retrySendDataCache!=null&&collector!=null) {
                    taskScheduler.scheduleNextRetrySendData(new RetrySendDataTask(sender,retrySendDataCache,collector));
                }
            }, 1, sendInterval, TimeUnit.SECONDS);
        }
    }
}
