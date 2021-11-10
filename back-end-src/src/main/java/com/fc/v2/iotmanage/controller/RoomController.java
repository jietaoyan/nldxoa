package com.fc.v2.iotmanage.controller;

import com.fc.v2.common.domain.AjaxResult;
import com.fc.v2.iotmanage.model.respone.SmokeInfoExample;
import com.fc.v2.iotmanage.model.respone.SocketInfo;
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
import springfox.documentation.schema.Example;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/room")
public class RoomController {



    private static Logger logger = LoggerFactory.getLogger(RoomController.class);

    @ApiOperation(value = "获取场所room详情", notes = "获取场所room详情")
    @GetMapping("/detail/{roomId}")
    @ResponseBody
    @ApiImplicitParams({
            @ApiImplicitParam(name = "roomId",value = "room编号", required = true, dataType = "int", paramType = "path", example = "0010"),
            @ApiImplicitParam(name = "isShow",value = "是否展示空间", required = false, dataType = "String", paramType = "path", example = "0010")
    })
    public AjaxResult getRoomDetailInfo(HttpServletRequest request, @PathVariable("roomId") int roomId) {
        //todo 完成物联网平台数据调用
        SmokeInfoExample smokeInfoExample = new SmokeInfoExample();
        smokeInfoExample.createCriteria().andRoomIdEqualTo(roomId);



        //SpaceTerminalDetailInfo spaceTerminalDetailInfo = new SpaceTerminalDetailInfo();
        return AjaxResult.successData(200,null);
    }


}
