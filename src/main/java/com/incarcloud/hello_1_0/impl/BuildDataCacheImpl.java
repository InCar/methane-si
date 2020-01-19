package com.incarcloud.hello_1_0.impl;

import com.incarcloud.hello_1_0.structure.BuildDataCache;
import com.incarcloud.std.HelloV;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 模拟数据缓存(注意线程安全问题)
 */
@Service
public class BuildDataCacheImpl implements BuildDataCache {

    private static final Logger LOGGER = LoggerFactory.getLogger(BuildDataCacheImpl.class);

    private List<HelloV.HelloRequestV1> list = new ArrayList<>();
    /**
     * 存入模拟数据
     * @param dataList
     */
    public void put(List<HelloV.HelloRequestV1> dataList){
        if(dataList != null){
            for(HelloV.HelloRequestV1 request : dataList){
                list.add(request);
            }
        }
    }

    /**
     * 拿走模拟数据
     * @return
     */
    public List<HelloV.HelloRequestV1> take(){

        List<HelloV.HelloRequestV1> resultList = new ArrayList<>();

        for(HelloV.HelloRequestV1 request : list){
            resultList.add(request);
        }

        list.clear();
        return resultList;
    }
}
