package com.bot.springbootmall.product.dto;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor(force = true)
public class CreateOrderRequest {
    @NotEmpty
    List<BuyItem> buyItemList;

}