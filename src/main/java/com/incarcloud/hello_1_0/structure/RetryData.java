package com.incarcloud.hello_1_0.structure;

import com.incarcloud.std.HelloV;

import java.util.concurrent.atomic.AtomicInteger;

public class RetryData {
    //数据
    HelloV data;
    //重发次数
    AtomicInteger time=new AtomicInteger();

    public HelloV getData() {
        return data;
    }

    public AtomicInteger getTime() {
        return time;
    }

    public RetryData(HelloV data) {
        this.data = data;
    }
}
