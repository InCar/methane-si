package com.incarcloud.hello_1_0.structure;

import com.incarcloud.std.HelloV;

import java.util.List;

/**
 * 模拟数据生成器
 */
public interface DataBuilder {
    /**
     * 数据模拟器
     * @param exts
     * @return
     */
    List<HelloV.HelloRequestV1> build(Object... exts);
}
