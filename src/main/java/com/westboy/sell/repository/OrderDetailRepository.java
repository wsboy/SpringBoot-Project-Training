package com.westboy.sell.repository;

import com.westboy.sell.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: wangpengbo
 * @date: 2017/11/20
 */
@Repository
public interface OrderDetailRepository  extends JpaRepository<OrderDetail, String> {

    List<OrderDetail> findByOrderId(String orderId);
}
