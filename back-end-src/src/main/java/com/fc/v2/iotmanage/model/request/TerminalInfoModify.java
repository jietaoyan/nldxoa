package com.fc.v2.iotmanage.model.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class TerminalInfoModify extends TerminalInfo{

    @ApiModelProperty("终端在平台上的唯一标识符")
    private String oidIndex;

}
