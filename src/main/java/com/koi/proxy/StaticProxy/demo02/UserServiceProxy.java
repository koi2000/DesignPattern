package com.koi.proxy.StaticProxy.demo02;

/**
 * @author koi
 * @date 2022/7/13 16:07
 */
public class UserServiceProxy implements UserService{
    UserServiceImpl userService;

    public UserServiceProxy() {
        userService = new UserServiceImpl();
    }

    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void update() {
        log("upd");
        userService.add();
    }

    public void log(String msg){
        System.out.println("使用了" + msg);
    }
}
