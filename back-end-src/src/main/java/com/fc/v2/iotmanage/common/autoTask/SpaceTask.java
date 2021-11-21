package com.fc.v2.iotmanage.common.autoTask;

import com.fc.v2.iotmanage.common.constant.SpaceConstant;
import com.fc.v2.iotmanage.util.RestTemplateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import com.alibaba.fastjson.JSONObject;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author so
 * 自动同步空间信息数据
 */
@Component("spaceTask")
public class SpaceTask {

    @Value("${iot.host}")
    String hsot;
    @Value("${iot.apikey}")
    String apikey;

    public void runTask1() {
        System.out.println("正在执行定时任务，无参方法");
        String URL =hsot + SpaceConstant.GET_SHOP_INFO;
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("apikey",apikey);
        System.out.println(RestTemplateUtils.get(URL,null,httpHeaders));
    }



    /**
     * 有参任务
     * 目前仅执行常见的数据类型  Integer Long  带L  string  带 ''  bool Double 带 d
     * @param a
     * @param b
     */
    public void runTask2(Integer a,Long b,String c,Boolean d,Double e) {


    }



}
