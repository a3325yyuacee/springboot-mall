package com.bot.springbootmall.product.dao;

import com.bot.springbootmall.product.dto.ProductQueryParams;
import com.bot.springbootmall.product.dto.ProductRequest;
import com.bot.springbootmall.product.model.Product;

import java.util.List;

public interface ProductDao {
    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Product getProductByIdForUpdate(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct (Integer productId, ProductRequest productRequest);

    void updateStock(Integer productId, Integer stock);

    void deleteProductById (Integer productId);

    Integer countProduct (ProductQueryParams productQueryParams);

    List<Product> getAllProductsForCart(ProductQueryParams productQueryParams);

}
