package com.koi.proxy.StaticProxy.demo02;

/**
 * @author koi
 * @date 2022/7/13 16:05
 */
public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("add");
    }

    @Override
    public void update() {
        System.out.println("upd");
    }
}
