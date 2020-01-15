package com.incarcloud.hello_1_0.structure;

import com.incarcloud.std.HelloV;

import java.util.List;

public interface BuildDataCache {
    void put(List<HelloV> dataList);

    List<HelloV> take();
}
