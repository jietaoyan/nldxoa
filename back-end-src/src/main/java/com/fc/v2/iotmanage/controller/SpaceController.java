package com.fc.v2.iotmanage.controller;

import com.fc.v2.common.domain.AjaxResult;
import com.fc.v2.iotmanage.mapper.ShopInfoMapper;
import com.fc.v2.iotmanage.mapper.SpaceInfoMapper;
import com.fc.v2.iotmanage.model.request.TerminalHisQuery;
import com.fc.v2.iotmanage.model.respone.*;
import com.fc.v2.util.TreeUtil.TreeUtil;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Controller
@RequestMapping("/space")
public class SpaceController {


    private static Logger logger = LoggerFactory.getLogger(SpaceController.class);

    @Autowired
    private ShopInfoMapper shopInfoMapper;

    @Autowired
    private SpaceInfoMapper spaceInfoMapper;
    @ApiOperation(value = "获取空间", notes = "获取空间列表")
    @GetMapping("/get")
    @ResponseBody
    public AjaxResult getSpaceList(HttpServletRequest request) {
        //todo 完成物联网平台数据调用获取空间列表

        List<ShopInfo> list = shopInfoMapper.selectByExample(null);
        return AjaxResult.successData(200,list);
    }

    @ApiOperation(value = "获取空间树", notes = "获取空间列表,获取更新点，root=0")
    @GetMapping("/getTree/{root}")
    @ResponseBody
    @ApiImplicitParams({
            @ApiImplicitParam(name = "root",value = "根节点编号，获取根节点，root=0", required = true, dataType = "String", paramType = "path", example = "0")
    })
    public AjaxResult getSpaceTree(HttpServletRequest request, @PathVariable("root") int root) {
        //todo 完成物联网平台数据调用获取空间列表


        List<SpaceInfo> list= spaceInfoMapper.selectByExample(null);
        List<SpaceTree> treeList = list.stream()
                .filter(dept -> dept.getSpaceId()!=dept.getParentId())
                .map(dept -> {
                    SpaceTree node = new SpaceTree();
                    node.setSpaceId(dept.getSpaceId());
                    node.setId(dept.getSpaceId());
                    node.setParentId(dept.getParentId());
                    node.setSpaceName(dept.getSpaceName());
                    return node;
                }).collect(Collectors.toList());

        return AjaxResult.successData(200,TreeUtil.bulid(treeList, root));
    }



    @ApiOperation(value = "获取空间下场所room数据", notes = "获取场所数据")
    @GetMapping("/info/{spaceId}")
    @ResponseBody
    @ApiImplicitParams({
            @ApiImplicitParam(name = "spaceId",value = "空间编号", required = true, dataType = "String", paramType = "path", example = "0010")
    })
    public AjaxResult getSpaceTerminalInfo(HttpServletRequest request,@PathVariable("spaceId") String shopId) {
        //todo 完成物联网平台数据调用
        LocTerminalInfo locTerminalInfo = new LocTerminalInfo();
        List<LocTerminalInfo> list = new ArrayList<>();
        list.add(locTerminalInfo);
        return AjaxResult.successData(200,list);
    }


    @ApiOperation(value = "获取场所设备详情", notes = "获取场所设备详情")
    @GetMapping("/infoDetail/{locId}")
    @ResponseBody
    @ApiImplicitParams({
            @ApiImplicitParam(name = "locId",value = "场所编号", required = true, dataType = "String", paramType = "path", example = "0010")
    })
    public AjaxResult getSpaceTerminalDetailInfo(HttpServletRequest request,@PathVariable("locId") String locId) {
        //todo 完成物联网平台数据调用
        SpaceTerminalDetailInfo spaceTerminalDetailInfo = new SpaceTerminalDetailInfo();
        return AjaxResult.successData(200,spaceTerminalDetailInfo);
    }

    @ApiOperation(value = "获取场所设备历史数据查询", notes = "获取场所设备历史数据查询")
    @PostMapping(path = "/query", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public AjaxResult queryTerminalHisInfo(@RequestBody TerminalHisQuery terminalHisQuery){

        //todo 获取物联网厂商设备数据
        return AjaxResult.successData(200,null);
    }



}
