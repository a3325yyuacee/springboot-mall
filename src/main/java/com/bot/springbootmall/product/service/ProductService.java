package com.bot.springbootmall.product.service;

import com.bot.springbootmall.product.dto.ProductQueryParams;
import com.bot.springbootmall.product.dto.ProductRequest;
import com.bot.springbootmall.product.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

    Integer countProduct(ProductQueryParams productQueryParams);

    List<Product> getAllProductsForCart();

}
