package com.bot.springbootmall.product.controller;

import com.bot.springbootmall.product.dto.UserLoginRequest;
import com.bot.springbootmall.product.dto.UserRegisterRequest;
import com.bot.springbootmall.product.model.User;
import com.bot.springbootmall.product.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users/register")
    public ResponseEntity<User> register(@RequestBody @Valid UserRegisterRequest userRegisterRequest) {
        Integer userId = userService.register(userRegisterRequest);

        User user = userService.getUserById(userId);

        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @PostMapping("/users/login")
    public ResponseEntity<User> login(@RequestBody @Valid UserLoginRequest userLoginRequest) {
        return ResponseEntity.status(HttpStatus.OK).body(userService.login(userLoginRequest));
    }
}
