package com.incarcloud.hello_1_0.structure;

import com.incarcloud.std.HelloV;

import java.util.concurrent.atomic.AtomicInteger;

public class RetryData {
    //数据
    HelloV.HelloRequestV1 data;
    //重发次数
    AtomicInteger time=new AtomicInteger();

    public HelloV.HelloRequestV1 getData() {
        return data;
    }

    public AtomicInteger getTime() {
        return time;
    }

    public RetryData(HelloV.HelloRequestV1 data) {
        this.data = data;
    }
}
