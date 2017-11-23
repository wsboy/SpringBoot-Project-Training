package com.westboy.sell.service;

import com.westboy.sell.dto.OrderDTO;

/**
 * @author: wangpengbo
 * @date: 2017/11/24
 */
public interface BuyerService {

    /**
     * 查询一个订单
     */
    OrderDTO findOrderOne(String openid, String orderId);

    /**
     * 取消订单
     */
    OrderDTO cancelOrder(String openid, String orderId);
}
