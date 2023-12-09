package com.bot.springbootmall.product.service;

import com.bot.springbootmall.product.dto.ProductQueryParams;
import com.bot.springbootmall.product.dto.ProductRequest;
import com.bot.springbootmall.product.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(long id);

    Integer countProduct(ProductQueryParams productQueryParams);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(long productId, ProductRequest productRequest);

    void deleteProductById(long productId);
}