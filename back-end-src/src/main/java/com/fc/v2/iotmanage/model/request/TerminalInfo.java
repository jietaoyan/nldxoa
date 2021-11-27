package com.fc.v2.iotmanage.model.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class TerminalInfo {

    //todo 新增接口编辑
    @ApiModelProperty(value="用户名",name="username",example="xingguo")
    private String shopId;

    @ApiModelProperty("终端名称")
    private String tmnName;

    @ApiModelProperty("终端名称")
    private String description;

    @ApiModelProperty("终端类型 目前支持终端类型为：消防水压 fireHydrant、烟感 smokeDetector、可燃气体combustibleGas、" +
            "用电安全 electricalSafety、井盖manholeCover、垃圾桶trashcan、环境监测environment、车位parkingSpace")
    private String tmnType;

    @ApiModelProperty("地图类型 bd-09 (百度) gcj-02 (高德) wgs84(GPS)")
    private String coordType;

    @ApiModelProperty("经度")
    private String longitude;

    @ApiModelProperty("纬度")
    private String latitude;

    @ApiModelProperty("地址, 长度限制不超过80")
    private String location;

    @ApiModelProperty("车位编号（只支持tmnType为parkingSpace的终端设置")
    private String parkingId;

    @ApiModelProperty("直接负责人姓名（直接负责人姓名和电话必须同时存在）")
    private String name;

    @ApiModelProperty("直接负责人电话")
    private String tel;

}
