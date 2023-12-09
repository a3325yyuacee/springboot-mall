package com.bot.springbootmall.product.service.impl;

import com.bot.springbootmall.product.dao.ProductDao;
import com.bot.springbootmall.product.dto.ProductQueryParams;
import com.bot.springbootmall.product.dto.ProductRequest;
import com.bot.springbootmall.product.model.Product;
import com.bot.springbootmall.product.rowmapper.ProductRowMapper;
import com.bot.springbootmall.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductServiceImpl implements ProductService {

    private final ProductDao productDao;

    public ProductServiceImpl(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public Integer countProduct(ProductQueryParams productQueryParams) {
        return productDao.countProduct(productQueryParams);
    }

    @Override
    public List<Product> getProducts(ProductQueryParams productQueryParams) {
        return productDao.getProducts(productQueryParams);
    }

    public Product getProductById(long productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }

    @Override
    public void updateProduct(long productId, ProductRequest productRequest) {
        productDao.updateProduct(productId, productRequest);
    }

    @Override
    public void deleteProductById(long productId) {
        productDao.deleteProductById(productId);
    }
}