package com.westboy.sell.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author: wangpengbo
 * @date: 2017/11/20
 */
@Data
@AllArgsConstructor
public class CartDTO {

    private String productId;

    private Integer productQuantity;

}
