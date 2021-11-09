package com.fc.v2.iotmanage.controller;


import com.fc.v2.common.domain.AjaxResult;
import com.fc.v2.iotmanage.model.request.TerminalHisQuery;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/terminal")
public class TerminalController {

    private static Logger logger = LoggerFactory.getLogger(TerminalController.class);


    @ApiOperation(value = "获取场所设备历史数据查询", notes = "获取场所设备历史数据查询")
    @PostMapping(path = "/query", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public AjaxResult queryTerminalHisInfo(@RequestBody TerminalHisQuery terminalHisQuery){

        //todo 获取物联网厂商设备数据
        return AjaxResult.successData(200,null);
    }


}
