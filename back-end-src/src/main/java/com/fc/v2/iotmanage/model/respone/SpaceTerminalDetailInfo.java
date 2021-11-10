package com.fc.v2.iotmanage.model.respone;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel(value = "SpaceTerminalDetailInfo", description = "空间设备数据详情")
public class SpaceTerminalDetailInfo {


    @ApiModelProperty(value = "开关信息")
    private SwitchInfo switchInfo;

    @ApiModelProperty(value = "16A插座信息")
    private SocketInfo socket16Info;

    @ApiModelProperty(value = "10A插座-1信息")
    private SocketInfo socket10_1Info;

    @ApiModelProperty(value = "10A插座-2信息")
    private SocketInfo socket10_2Info;

    @ApiModelProperty(value = "空调信息")
    private AirConditionInfo airConditionInfo;


    SpaceTerminalDetailInfo(SwitchInfo switchInfo, List<SocketInfo> list, AirConditionInfo airConditionInfo){
        this.switchInfo = switchInfo;
        this.airConditionInfo = airConditionInfo;
        for(SocketInfo socketInfo: list){
            if("1".equals(socketInfo.getType())){
                this.socket10_1Info = socketInfo;
            }else if("2".equals(socketInfo.getType())){
                this.socket10_2Info = socketInfo;
            }else if("3".equals(socketInfo.getType())){
                this.socket16Info = socketInfo;
            }
        }
    }



}
