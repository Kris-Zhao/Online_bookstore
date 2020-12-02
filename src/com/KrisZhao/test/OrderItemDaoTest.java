package com.KrisZhao.test;

import com.KrisZhao.dao.OrderItemDao;
import com.KrisZhao.dao.impl.OrderItemDaoImpl;
import com.KrisZhao.pojo.OrderItem;
import org.junit.Test;

import java.math.BigDecimal;

public class OrderItemDaoTest {

    @Test
    public void saveOrderItem() {
        OrderItemDao orderItemDao = new OrderItemDaoImpl();

        orderItemDao.saveOrderItem(new OrderItem(null,"How to Programme: Java", 1,new BigDecimal(100),new BigDecimal(100),"1234567890"));
        orderItemDao.saveOrderItem(new OrderItem(null,"How to Programme: Javascript", 2,new BigDecimal(100),new BigDecimal(200),"1234567890"));
        orderItemDao.saveOrderItem(new OrderItem(null,"Netty", 1,new BigDecimal(100),new BigDecimal(100),"1234567890"));

    }
}