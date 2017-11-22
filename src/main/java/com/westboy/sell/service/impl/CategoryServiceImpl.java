package com.westboy.sell.service.impl;

import com.westboy.sell.dataobject.ProductCategory;
import com.westboy.sell.repository.CategoryRepository;
import com.westboy.sell.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: wangpengbo
 * @date: 2017/11/17
 */
@Service
public class CategoryServiceImpl implements CategoryService {


    private final CategoryRepository repository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository repository) {
        this.repository = repository;
    }


    @Override
    public ProductCategory findOne(Integer productCategoryId) {
        return repository.findOne(productCategoryId);
    }

    @Override
    public List<ProductCategory> findAll() {
        return repository.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return repository.findByCategoryTypeIn(categoryTypeList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return repository.save(productCategory);
    }
}
