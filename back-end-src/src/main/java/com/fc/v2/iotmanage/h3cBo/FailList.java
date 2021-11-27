package com.fc.v2.iotmanage.h3cBo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class FailList {

    @ApiModelProperty("oidIndex数组")
    private List<String> failList;
}
