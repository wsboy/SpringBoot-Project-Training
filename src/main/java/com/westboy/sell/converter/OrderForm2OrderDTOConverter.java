package com.westboy.sell.converter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.westboy.sell.dataobject.OrderDetail;
import com.westboy.sell.dto.OrderDTO;
import com.westboy.sell.enums.ResultEnum;
import com.westboy.sell.exception.SellException;
import com.westboy.sell.form.OrderForm;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @author: wangpengbo
 * @date: 2017/11/22
 */
@Slf4j
public class OrderForm2OrderDTOConverter {

    public static OrderDTO convert(OrderForm orderForm) {
        Gson gson = new Gson();

        OrderDTO orderDTO = new OrderDTO();

        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());

        List<OrderDetail> orderDetailList;
        try {
            orderDetailList = gson.fromJson(orderForm.getItems(), new TypeToken<List<OrderDetail>>(){}.getType());
        } catch (Exception e) {
            log.error("【对象转换】错误，string={}", orderForm.getItems());
            throw new SellException(ResultEnum.PARAM_ERROR);
        }

        orderDTO.setOrderDetailList(orderDetailList);

        return orderDTO;
    }

}
