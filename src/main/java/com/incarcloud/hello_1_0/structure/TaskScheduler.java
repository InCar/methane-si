package com.incarcloud.hello_1_0.structure;

import java.util.concurrent.ScheduledFuture;

public interface TaskScheduler {
    /**
     * 生成下一次的数据生成任务(存入缓存)
     */
    ScheduledFuture scheduleNextBuildData(Runnable task);

    /**
     * 生成下一次的数据发送任务(从缓存中取出数据发送)
     */
    ScheduledFuture scheduleNextSendData(Runnable task);

    /**
     * 生成下一次的数据重发任务(从缓存中取出数据发送)
     */
    ScheduledFuture scheduleNextRetrySendData(Runnable task);
}
