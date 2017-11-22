package com.westboy.sell.dataobject;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @author: wangpengbo
 * @date: 2017/11/17
 */
@Entity
@DynamicInsert
@DynamicUpdate
@Data
@NoArgsConstructor
public class ProductInfo {

    @Id
    private String productId;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 商品价格
     */
    private BigDecimal productPrice;

    /**
     * 商品库存
     */
    private Integer productStock;

    /**
     * 商品描述
     */
    private String productDescription;

    /**
     * 商品图标
     */
    private String productIcon;

    /**
     * 商品状态
     */
    private Integer productStatus;

    /**
     * 类目编号
     */
    private Integer categoryType;

}
