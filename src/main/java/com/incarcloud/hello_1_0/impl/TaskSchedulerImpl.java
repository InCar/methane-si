package com.incarcloud.hello_1_0.impl;

import com.incarcloud.hello_1_0.structure.BuildDataTask;
import com.incarcloud.hello_1_0.structure.RetrySendDataTask;
import com.incarcloud.hello_1_0.structure.SendDataTask;
import com.incarcloud.hello_1_0.structure.TaskScheduler;
import org.springframework.stereotype.Service;

import java.util.concurrent.ScheduledFuture;

@Service
public class TaskSchedulerImpl implements TaskScheduler{
    /**
     * 执行任务并生成下一次的数据生成任务(存入缓存)
     */
    @Override
    public ScheduledFuture scheduleNextBuildData(BuildDataTask task){
        task.run();
        return null;
    }

    /**
     * 执行任务并生成下一次的数据发送任务(从缓存中取出数据发送)
     */
    @Override
    public ScheduledFuture scheduleNextSendData(SendDataTask task){
        task.run();
        return null;
    }

    /**
     * 执行任务并生成下一次的数据重发任务(从缓存中取出数据发送)
     */
    public ScheduledFuture scheduleNextRetrySendData(RetrySendDataTask task){
        return null;
    }
}
