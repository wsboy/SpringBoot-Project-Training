package com.westboy.sell.service;

import com.westboy.sell.dataobject.ProductInfo;
import com.westboy.sell.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author: wangpengbo
 * @date: 2017/11/17
 */
public interface ProductInfoService {

    ProductInfo findOne(String productInfoId);

    /**
     * 查询所有在架商品
     */
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    /**
     * 加库存
     */
    void increaseStock(List<CartDTO> cartDTOList);

    /**
     * 减库存
     */
    void decreaseStock(List<CartDTO> cartDTOList);

}
