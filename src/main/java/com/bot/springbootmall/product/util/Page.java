package com.bot.springbootmall.product.util;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Page<T> {

    Integer limit;
    Integer offset;
    Integer total;
    List<T> results;
}