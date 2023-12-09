package com.bot.springbootmall.product.dao;

import com.bot.springbootmall.product.dto.ProductQueryParams;
import com.bot.springbootmall.product.dto.ProductRequest;
import com.bot.springbootmall.product.model.Product;

import java.util.List;

public interface ProductDao {
    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(long productId);

    Integer countProduct(ProductQueryParams productQueryParams);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(long productId, ProductRequest productRequest);

    void updateStock(long productId, Integer stock);

    void deleteProductById(long productId);
}