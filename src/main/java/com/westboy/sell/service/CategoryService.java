package com.westboy.sell.service;

import com.westboy.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * @author: wangpengbo
 * @date: 2017/11/17
 */

public interface CategoryService {

    ProductCategory findOne(Integer productCategoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);

}
