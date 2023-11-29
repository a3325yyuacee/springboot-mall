package com.bot.springbootmall.product.service;

import com.bot.springbootmall.product.dto.UserLoginRequest;
import com.bot.springbootmall.product.dto.UserRegisterRequest;
import com.bot.springbootmall.product.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);
}
