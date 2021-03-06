package com.fc.v2.iotmanage.h3cBo;

import lombok.Data;

import java.util.List;

@Data
public class UserShop {


    private String userName;
    private String shopName;
    private Long shopId;
    private String province;
    private String city;
    private String area;
    private String address;
    private String phone;
    private String scenarioName;

    List<Columns> columns;

}
