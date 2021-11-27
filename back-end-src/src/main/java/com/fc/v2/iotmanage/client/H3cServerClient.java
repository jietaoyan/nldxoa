package com.fc.v2.iotmanage.client;

import com.fc.v2.iotmanage.h3cBo.FailList;
import com.fc.v2.iotmanage.h3cBo.H3CResponse;
import com.fc.v2.iotmanage.h3cBo.UserShop;
import com.fc.v2.iotmanage.model.request.TerminalInfoAdd;
import com.fc.v2.iotmanage.model.request.TerminalInfoModify;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(
        name = "H3cServerClient",
//        url = "https://iot-developer.h3c.com:65104/restapi/"
        url = "${iot.host}"
)
public interface H3cServerClient {
    /**
     * 获取UserShop
     */
    @GetMapping(value = "/user/shop", headers = {"apikey=${iot.apikey}"})
    H3CResponse<List<UserShop>> getUserShop();

    /**
     * 3.2.1	添加单个终端
     * @param terminalInfoAdd
     * @return
     */
    @PostMapping(value = "/iot/iotparkdataanalysis/proxy/terminal", headers = {"apikey=${iot.apikey}"})
    H3CResponse<TerminalInfoModify> addDevice(TerminalInfoAdd terminalInfoAdd);

    /**
     * 3.2.2	修改单个终端
     * @param terminalInfoModify
     * @return
     */
    @PutMapping(value = "/iot/iotparkdataanalysis/proxy/terminal", headers = {"apikey=${iot.apikey}"})
    H3CResponse modifyDevice(TerminalInfoModify terminalInfoModify);

    /**
     * 3.2.3	批量删除终端
     * @param terminalInfoModify
     * shopId
     * oidIndex 终端在平台的唯一标识符，多个 eg:"123,345"
     * @return
     */
    @DeleteMapping(value = "/iot/iotparkdataanalysis/proxy/terminal", headers = {"apikey=${iot.apikey}"})
    H3CResponse<FailList> deleteDevice(TerminalInfoModify terminalInfoModify);

    /**
     * 3.2.4	修改单个终端
     * @param terminalInfoModify
     * shopId
     * oidIndex
     * @return
     */
    @GetMapping(value = "/iot/iotparkdataanalysis/proxy/terminal", headers = {"apikey=${iot.apikey}"})
    H3CResponse listDevice(TerminalInfoModify terminalInfoModify);
}
