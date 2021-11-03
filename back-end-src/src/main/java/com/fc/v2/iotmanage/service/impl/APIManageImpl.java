package com.fc.v2.iotmanage.service.impl;

import com.fc.v2.iotmanage.service.IAPIManage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class APIManageImpl implements IAPIManage {

    /**
     * 存储静态的apikey的值，默认为空，第一次获取就进行该值的储存，有效时间为天
     * 这里不做时间显示，如果存在值过期就重新获取
     */
    @Value("${iot.apikey}")
    private static String apiKey;

    @Override
    public String getApiKey() {

        return apiKey;

    }



}
