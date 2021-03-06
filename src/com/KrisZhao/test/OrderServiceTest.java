package com.KrisZhao.test;

import com.KrisZhao.pojo.Cart;
import com.KrisZhao.pojo.CartItem;
import com.KrisZhao.service.OrderService;
import com.KrisZhao.service.impl.OrderServiceImpl;
import org.junit.Test;

import java.math.BigDecimal;

public class OrderServiceTest {

    @Test
    public void createOrder() {

        Cart cart = new Cart();

        cart.addItem(new CartItem(1, "How to Programme: Java", 1, new BigDecimal(1000),new BigDecimal(1000)));
        cart.addItem(new CartItem(1, "How to Programme: Java", 1, new BigDecimal(1000),new BigDecimal(1000)));
        cart.addItem(new CartItem(2, "Data Structures and Algorithms", 1, new BigDecimal(100),new BigDecimal(100)));

        OrderService orderService = new OrderServiceImpl();

        System.out.println( "The order number is ：" + orderService.createOrder(cart, 1) );

    }
}