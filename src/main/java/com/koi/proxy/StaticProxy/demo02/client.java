package com.koi.proxy.StaticProxy.demo02;

/**
 * @author koi
 * @date 2022/7/13 16:09
 */
public class client {

    public static void main(String[] args) {
        UserServiceProxy userServiceProxy = new UserServiceProxy();
        userServiceProxy.add();
    }
}
