package com.fc.v2.iotmanage.service.impl;

import com.fc.v2.iotmanage.common.constant.SpaceConstant;
import com.fc.v2.iotmanage.service.ISpaceManage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author so
 * 空间管理服务
 */
@Service
public class SpaceManageImpl implements ISpaceManage {

    //@Value("${iot.apikey:R3gO5ZBoQ6TeQBdQNAyixCc8kCEqq3T8}")
    // 测似环境 iot-developer
    // private static String apiKey = "R3gO5ZBoQ6TeQBdQNAyixCc8kCEqq3T8";
    // 绿洲lvzhouapi
    private static String apiKey = "720b1bc785974d829b03207bba6a8116";

    //@Value("${iot.host:https://lvzhouapi.h3c.com/iot}")
    private static String host = "https://lvzhouapi.h3c.com/iot";

    @Override
    public void getSpace() {

        String url = host + SpaceConstant.GET_SPACE_INFO;
        Map<String, String> headers = new HashMap<>();
        Map<String, Object> body = new HashMap<>();

        sendHttp(url,null,null);

    }
    public void getShop() {

    }

    private ResponseEntity<String> sendHttp(String url, Map<String, String> header, Map<String, Object> body){
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("apiKey",apiKey);
        for(Map.Entry<String, String > entry: header.entrySet()){
            headers.add(entry.getKey(),entry.getValue());
        }
        MultiValueMap<String,Object> resqBody = new LinkedMultiValueMap<>();
        for(Map.Entry<String, Object > entry: body.entrySet()){
            resqBody.add(entry.getKey(),entry.getValue());
        }
        HttpEntity<MultiValueMap<String,Object>> requestEntity = new HttpEntity<>(resqBody, headers);


        ResponseEntity<String> resEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, String.class);
        return resEntity;
    }

}