package com.fc.v2.iotmanage.model.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class TerminalInfo {

    //todo 新增接口编辑
    @ApiModelProperty(value="用户名",name="username",example="xingguo")
    private String shopId;

    private String appKey;

    private String tmnName;

    private String devEUI;

    private String description;

    private String tmnType;

    private String devType;

    private String coordType;

    private String longitude;

    private String latitude;

    private String location;

    private String parkingId;

    private String name;

    private String tel;

}
