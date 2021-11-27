package com.fc.v2.iotmanage.h3cBo;

import com.fc.v2.iotmanage.model.request.TerminalInfoAdd;
import io.swagger.annotations.ApiModelProperty;

public class DevicePageParams extends TerminalInfoAdd {

    @ApiModelProperty("当前页，必须大于0")
    private Integer pageNum;

    @ApiModelProperty("每页大小,范围为1 ~ 200")
    private Integer pageSize;


}
