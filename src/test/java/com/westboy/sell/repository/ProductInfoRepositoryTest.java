package com.westboy.sell.repository;

import com.westboy.sell.dataobject.ProductInfo;
import com.westboy.sell.enums.ProductInfoStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author: wangpengbo
 * @date: 2017/11/17
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository repository;

    @Test
    public void saveTest() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123456");
        productInfo.setProductName("臊子面");
        productInfo.setProductPrice(new BigDecimal(8.5));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("很好吃的面");
        productInfo.setProductIcon("http://xxxxxx.jpg");
        productInfo.setProductStatus(ProductInfoStatusEnum.UP.getCode());
        productInfo.setCategoryType(2);
        ProductInfo result = repository.save(productInfo);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByProductStatus() throws Exception {
        List<ProductInfo> productInfoList = repository.findByProductStatus(0);
        Assert.assertNotEquals(0, productInfoList.size());
    }


}