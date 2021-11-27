package com.fc.v2.iotmanage.h3cBo;

import io.swagger.annotations.ApiModelProperty;

import java.util.Map;

public class Sensors {

    @ApiModelProperty("传感器类型,见附录5.1")
    private String sensorType;

    @ApiModelProperty("传感器协议地址")
    private String modbusIs;

    @ApiModelProperty("上一次上报时间")
    private String lastUploadTime;

    @ApiModelProperty("上报周期")
    private String reportPeriod;

    @ApiModelProperty("创建时间")
    private String createTime;

    @ApiModelProperty("具体的传感器上报数据（JSON格式）")
    private Map<String, Object> sensorJson;

}
