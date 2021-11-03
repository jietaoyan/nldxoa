package com.fc.v2.iotmanage.model.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "设备历史数据查询条件")
public class TerminalHisQuerry {

    @ApiModelProperty(value = "type",name = "设备类型", example = "开关/10A插座-1/10A插座-2/16A插座/空调")
    private String type;

    @ApiModelProperty(value = "period",name = "期间", example = "day/week/month/year")
    private String period;

}
