package com.KrisZhao.test;

import com.KrisZhao.dao.UserDao;
import com.KrisZhao.dao.impl.UserDaoImpl;
import com.KrisZhao.pojo.User;
import org.junit.Test;

public class UserDaoTest {

    UserDao userDao = new UserDaoImpl();

    @Test
    public void queryUserByUsername() {

        if (userDao.queryUserByUsername("admin1234") == null ){
            System.out.println("The username can be used！");
        } else {
            System.out.println("The username is already used！");
        }
    }

    @Test
    public void queryUserByUsernameAndPassword() {
        if ( userDao.queryUserByUsernameAndPassword("admin","admin1234") == null) {
            System.out.println("Wrong username or password, log in failure");
        } else {
            System.out.println("Query successfully!");
        }
    }

    @Test
    public void saveUser() {
        System.out.println( userDao.saveUser(new User(null,"wzg168", "123456", "wzg168@qq.com")) );
    }
}