package com.incarcloud.hello_1_0.impl;

import com.alibaba.fastjson.JSONObject;
import com.google.protobuf.ByteString;
import com.incarcloud.hello_1_0.structure.DataBuilder;
import com.incarcloud.std.HelloV;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 模拟数据生成器
 */
@Service
public class DataBuilderImpl implements DataBuilder{

    @Value("${message.json}")
    private String jsonData;
    @Value("${server.clients}")
    private int clients;
    @Value("${server.vin}")
    private String mockVin;

    /**
     * 数据模拟器
     * @param exts
     * @return
     */
    public List<HelloV.HelloRequestV1> build(Object... exts){
        List<HelloV.HelloRequestV1> list = new ArrayList<>();
        String preMockVin = mockVin.substring(0, 11);
        String postMockVin = mockVin.substring(11, 17);
        Long time = System.currentTimeMillis() / 1000 - 30;
        if(clients > 0){
            Integer temp = Integer.parseInt(postMockVin);
            for(int i = 0;i < clients;i ++){
                temp += i;
                String vin = preMockVin + temp;

                byte[] bytes = genRvmData(vin, time);

                HelloV.HelloRequestV1.Builder builder = HelloV.HelloRequestV1.newBuilder();
                builder.setVin(vin);
                ByteString byteString = ByteString.copyFrom(vin.getBytes());
                builder.setVinBytes(byteString);
                HelloV.HelloRequestV1 request = builder.build();

                list.add(request);
            }
        }
        return list;
    }

    /**
     * 生成上汽模拟数据
     *
     * @param vin
     * @param time
     * @return
     */
    private byte[] genRvmData(String vin, Long time){
        String json = jsonData;

        JSONObject obj = JSONObject.parseObject(json);
        JSONObject tboxinfo = obj.getJSONObject("tboxinfo");
        tboxinfo.put("VIN", vin);
        obj.put("VIN", tboxinfo);
        obj.put("FileCreationTime", time);

        return obj.toJSONString().getBytes();
    }
}
