package com.bot.springbootmall.product.dto;

import lombok.Builder;
import lombok.Value;

import javax.validation.constraints.NotNull;

@Builder
@Value
public class BuyItem {
    @NotNull Integer productId;

    @NotNull Integer quantity;
}

