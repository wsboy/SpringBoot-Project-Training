package com.westboy.sell.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author: wangpengbo
 * @date: 2017/11/20
 */
@Getter
@AllArgsConstructor
public enum PayStatusEnum {

    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功");

    private Integer code;

    private String message;
}
