package com.KrisZhao.test;

import java.lang.reflect.Method;

public class UserServletTest {

    public void login() {
        System.out.println("login() method is called");
    }

    public void regist() {
        System.out.println("regist() method is called");
    }

    public void updateUser() {
        System.out.println("updateUser() method is called");
    }

    public void updateUserPassword() {
        System.out.println("updateUserPassword() method is called");
    }


    public static void main(String[] args) {
        String action = "regist";

        try {
            // 获取action业务鉴别字符串，获取相应的业务 方法反射对象
            Method method = UserServletTest.class.getDeclaredMethod(action);

//            System.out.println(method);
            // 调用目标业务 方法
            method.invoke(new UserServletTest() );

        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}
