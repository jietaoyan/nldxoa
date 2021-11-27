package com.fc.v2.iotmanage.model.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class TerminalInfoAdd extends TerminalInfo{

    @ApiModelProperty("应用密钥为数字，长度限制32个字符")
    private String appKey;

    @ApiModelProperty("终端唯一标识符，长度限制16个字符")
    private String devEUI;

    @ApiModelProperty("终端设备型号,见附录5.3")
    private String devType;
}
