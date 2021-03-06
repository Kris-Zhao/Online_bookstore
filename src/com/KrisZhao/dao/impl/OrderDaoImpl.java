package com.KrisZhao.dao.impl;

import com.KrisZhao.dao.OrderDao;
import com.KrisZhao.pojo.Order;

public class OrderDaoImpl extends BaseDao implements OrderDao {
    @Override
    public int saveOrder(Order order) {

        System.out.println(" OrderDaoImpl program is in [" +Thread.currentThread().getName() + "]");

        String sql = "insert into t_order(`order_id`,`create_time`,`price`,`status`,`user_id`) values(?,?,?,?,?)";

        return update(sql,order.getOrderId(),order.getCreateTime(),order.getPrice(),order.getStatus(),order.getUserId());
    }
}
