package com.bot.springbootmall.product.constant;

import com.bot.springbootmall.product.model.Product;

public class EnumTest {
    public static void main(String[] args) {
        ProductCategory category = ProductCategory.FOOD;
        String s1 = category.name();
        System.out.println(s1); // FOOD

        String s2 = "CAR";
        ProductCategory category2 = ProductCategory.valueOf(s2);

    }
}
