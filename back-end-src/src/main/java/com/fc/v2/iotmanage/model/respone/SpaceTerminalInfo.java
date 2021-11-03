package com.fc.v2.iotmanage.model.respone;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author so
 * 返回给前端的空间管理明细信息
 */
@Data
@ApiModel(value = "SpaceTerminalInfo", description = "空间数据详情，名称可以固定使用")
public class SpaceTerminalInfo {

    //每间 1个智能开关（3键，照明控制）、2个10A的智能插座、1个16A智能插座、1个红外遥控器（空调控制）；
    @ApiModelProperty(value = "空间名称", example = "203机房")
    private String spaceName;

    @ApiModelProperty(value = "开关名称", example = "照明开关")
    private String switchName;
    @ApiModelProperty(value = "开关状态", example = "开;关")
    private String switchStatus;

    @ApiModelProperty(value = "16A插座名称", example = "16A插座")
    private String socketName16;
    @ApiModelProperty(value = "16A插座名称", example = "负载;正常")
    private String socketName16Status;

    @ApiModelProperty(value = "10A插座-1名称", example = "10A插座—1")
    private String socketName10_1;
    @ApiModelProperty(value = "10A插座—1状态", example = "负载;正常")
    private String socketName10_1Status;

    @ApiModelProperty(value = "10A插座-2名称", example = "10A插座—1")
    private String socketName10_2;
    @ApiModelProperty(value = "10A插座—2状态", example = "负载;正常")
    private String socketName10_2Status;

    @ApiModelProperty(value = "空调名称", example = "空调")
    private String airCondition;
    @ApiModelProperty(value = "空调状态", example = "开;关")
    private String airConditionStatus;
}
