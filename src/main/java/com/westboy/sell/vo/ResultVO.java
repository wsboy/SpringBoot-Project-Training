package com.westboy.sell.vo;

import lombok.Data;

/**
 * @author: wangpengbo
 * @date: 2017/11/18
 */
@Data
public class ResultVO<T> {

    private Integer code;

    private String msg;

    private T data;

}
