package com.westboy.sell.controller;

import com.westboy.sell.dataobject.ProductCategory;
import com.westboy.sell.dataobject.ProductInfo;
import com.westboy.sell.service.CategoryService;
import com.westboy.sell.service.ProductInfoService;
import com.westboy.sell.vo.ProductInfoVO;
import com.westboy.sell.vo.ProductVO;
import com.westboy.sell.vo.ResultVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: wangpengbo
 * @date: 2017/11/18
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    private  ProductInfoService productInfoService;

    private CategoryService categoryService;

    @Autowired
    public void setProductInfoService(ProductInfoService productInfoService) {
        this.productInfoService = productInfoService;
    }
    @Autowired
    public void setCategoryService(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/list")
    public ResultVO list() {

        //1.查询所有在架商品
        List<ProductInfo> productInfoList = productInfoService.findUpAll();
        //2.查询类目（一次性查询）
        List<Integer> categoryTypeList = productInfoList.stream()
                .map(ProductInfo::getCategoryType)
                .collect(Collectors.toList());
        List<ProductCategory> productCategoryList = categoryService.findByCategoryTypeIn(categoryTypeList);
        //3.数据拼装
        List<ProductVO> productVOList = new ArrayList<>();
        for (ProductCategory productCategory : productCategoryList) {
            ProductVO productVO = new ProductVO();
            productVO.setCategoryType(productCategory.getCategoryType());
            productVO.setCategoryName(productCategory.getCategoryName());

            List<ProductInfoVO> productInfoVOList = new ArrayList<>();
            for (ProductInfo productInfo : productInfoList) {
                if(productInfo.getCategoryType().equals(productCategory.getCategoryType())) {
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo, productInfoVO);
                    productInfoVOList.add(productInfoVO);
                }
            }
            productVO.setProductInfoVOList(productInfoVOList);
            productVOList.add(productVO);
        }

        ResultVO<List<ProductVO>> resultVO = new ResultVO<>();
        resultVO.setCode(0);
        resultVO.setMsg("success");
        resultVO.setData(productVOList);
        return resultVO;
    }

}
