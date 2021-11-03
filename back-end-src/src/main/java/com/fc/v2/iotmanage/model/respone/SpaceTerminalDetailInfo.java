package com.fc.v2.iotmanage.model.respone;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "SpaceTerminalDetailInfo", description = "空间设备数据详情")
public class SpaceTerminalDetailInfo {


    @ApiModelProperty(value = "开关信息")
    private SwitchInfo switchInfo;

    @ApiModelProperty(value = "16A插座信息")
    private Socket16Info socket16Info;

    @ApiModelProperty(value = "10A插座-1信息")
    private Socket10Info socket10_1Info;

    @ApiModelProperty(value = "10A插座-2信息")
    private Socket10Info socket10_2Info;

    @ApiModelProperty(value = "空调信息")
    private AirConditionInfo airConditionInfo;



}
