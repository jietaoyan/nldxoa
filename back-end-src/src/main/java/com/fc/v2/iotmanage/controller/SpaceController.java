package com.fc.v2.iotmanage.controller;

import com.fc.v2.common.domain.AjaxResult;
import com.fc.v2.iotmanage.model.respone.SpaceTerminalDetailInfo;
import com.fc.v2.iotmanage.model.respone.SpaceTerminalInfo;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/space")
public class SpaceController {


    private static Logger logger = LoggerFactory.getLogger(SpaceController.class);

    @ApiOperation(value = "获取空间数据", notes = "获取空间数据")
    @GetMapping("/info/{spaceId}")
    @ResponseBody
    @ApiImplicitParams({
            @ApiImplicitParam(name = "spaceId",value = "空间编号", required = true, dataType = "String", paramType = "path", example = "0010")
    })
    public AjaxResult getSpaceTerminalInfo(HttpServletRequest request,@PathVariable("spaceId") String shopId) {
        //todo 完成物联网平台数据调用
        SpaceTerminalInfo spaceTerminalInfo = new SpaceTerminalInfo();
        List<SpaceTerminalInfo> list = new ArrayList<SpaceTerminalInfo>();
        list.add(spaceTerminalInfo);
        return AjaxResult.successData(200,list);
    }


    @ApiOperation(value = "获取空间设备详情", notes = "获取空间设备详情")
    @GetMapping("/infoDetail/{spaceId}")
    @ResponseBody
    @ApiImplicitParams({
            @ApiImplicitParam(name = "spaceId",value = "空间编号", required = true, dataType = "String", paramType = "path", example = "0010")
    })
    public AjaxResult getSpaceTerminalDetailInfo(HttpServletRequest request,@PathVariable("spaceId") String shopId) {
        //todo 完成物联网平台数据调用
        SpaceTerminalDetailInfo spaceTerminalDetailInfo = new SpaceTerminalDetailInfo();
        return AjaxResult.successData(200,spaceTerminalDetailInfo);
    }

}
