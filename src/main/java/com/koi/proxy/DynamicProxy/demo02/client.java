package com.koi.proxy.DynamicProxy.demo02;

import com.koi.proxy.StaticProxy.demo02.UserService;
import com.koi.proxy.StaticProxy.demo02.UserServiceImpl;

/**
 * @author koi
 * @date 2022/7/13 16:32
 */

/*

*/
public class client {

    public static void main(String[] args) {
        // 真实角色
        UserServiceImpl userService = new UserServiceImpl();

        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        pih.setTarget(userService);
        UserService proxy = (UserService) pih.getProxy();
        proxy.add();
    }
}
