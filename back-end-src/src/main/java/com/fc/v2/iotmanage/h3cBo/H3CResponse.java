package com.fc.v2.iotmanage.h3cBo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class H3CResponse<T> {

    private Integer code;
    private String message;
    private T data;

}
