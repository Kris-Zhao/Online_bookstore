package com.KrisZhao.service;

import com.KrisZhao.pojo.Cart;

public interface OrderService {
    public String createOrder(Cart cart,Integer userId);
}
