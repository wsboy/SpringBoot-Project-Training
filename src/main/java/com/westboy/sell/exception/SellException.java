package com.westboy.sell.exception;

import com.westboy.sell.enums.ResultEnum;

/**
 * @author: wangpengbo
 * @date: 2017/11/20
 */

public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
