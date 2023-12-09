package com.bot.springbootmall.product.dto;

import com.bot.springbootmall.product.constant.ProductCategory;
import lombok.Value;


@Value
public class ProductQueryParams {

    ProductCategory productCategory;
    String search;
    String orderBy;
    String sort;
    Integer limit;
    Integer offset;
}