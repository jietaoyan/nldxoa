package com.fc.v2.iotmanage.h3cBo;

import com.fc.v2.iotmanage.model.request.TerminalInfoAdd;
import io.swagger.annotations.ApiModelProperty;

public class DevicePageList extends TerminalInfoAdd {

    @ApiModelProperty("终端在平台上的唯一标识符")
    private String oidIndex;

    @ApiModelProperty("终端厂商")
    private String tmnFacturer;

    @ApiModelProperty("0-离线 1-在线")
    private String onlineStatus;

    @ApiModelProperty("终端在平台上的唯一标识符")
    private String createTime;

    @ApiModelProperty("终端在平台上的唯一标识符")
    private String updateTime;

    @ApiModelProperty("终端在平台上的唯一标识符")
    private String sensors;

    @ApiModelProperty("终端在平台上的唯一标识符")
    private String principal;

}
