package com.westboy.sell.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author: wangpengbo
 * @date: 2017/11/17
 */
@Getter
@AllArgsConstructor
public enum ProductInfoStatusEnum {

    UP(0, "在架"),
    DOWN(1, "下架");

    private Integer code;

    private String message;

}
