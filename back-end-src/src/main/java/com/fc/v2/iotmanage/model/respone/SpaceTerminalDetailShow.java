package com.fc.v2.iotmanage.model.respone;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;



@Data
@ApiModel(value = "SpaceTerminalDetailShow", description = "展示空间设备数据详情")
public class SpaceTerminalDetailShow extends SpaceTerminalDetailInfo{


    @ApiModelProperty(value = "温湿度")
    private EnvInfo envInfo;

    @ApiModelProperty(value = "烟感")
    private SmokeInfo smokeInfo;

    SpaceTerminalDetailShow(SwitchInfo switchInfo, List<SocketInfo> list, AirConditionInfo airConditionInfo) {
        super(switchInfo, list, airConditionInfo);
    }

    SpaceTerminalDetailShow(SwitchInfo switchInfo, List<SocketInfo> list, AirConditionInfo airConditionInfo,EnvInfo envInfo,SmokeInfo smokeInfo) {
        super(switchInfo, list, airConditionInfo);
        this.envInfo = envInfo;
        this.smokeInfo = smokeInfo;

    }


}
