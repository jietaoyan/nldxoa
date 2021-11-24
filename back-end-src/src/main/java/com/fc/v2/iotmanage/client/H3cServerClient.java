package com.fc.v2.iotmanage.client;

import com.fc.v2.iotmanage.h3cBo.H3CResponse;
import com.fc.v2.iotmanage.h3cBo.UserShop;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(
        name = "H3cServerClient",
//        url = "https://iot-developer.h3c.com:65104/restapi/"
        url = "${iot.host}"
)
public interface H3cServerClient {
    /**
     * 创建群组
     */
    @GetMapping(value = "/user/shop", headers = {"apikey=${iot.apikey}"})
    H3CResponse<List<UserShop>> getUserShop();



}
