package com.westboy.sell.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author: wangpengbo
 * @date: 2017/11/20
 */
@Getter
@AllArgsConstructor
public enum OrderStatusEnum {

    NEW(0, "新订单"),
    FINISHED(1, "完结"),
    CANCEL(2, "已取消");

    private Integer code;

    private String message;

}
