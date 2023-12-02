package com.bot.springbootmall.product.dao;

import com.bot.springbootmall.product.dto.UserRegisterRequest;
import com.bot.springbootmall.product.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
