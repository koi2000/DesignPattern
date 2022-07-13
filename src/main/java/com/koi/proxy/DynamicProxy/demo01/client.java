package com.koi.proxy.DynamicProxy.demo01;

/**
 * @author koi
 * @date 2022/7/13 16:14
 */

/*
1. 动态代理和静态代理角色一样
2. 动态代理的类是动态生成的，不是直接写好的
3. 两大分类：基于接口的动态代理，基于类的动态代理
4. 需要了解两个类，InvocationHandler
*/
public class client {

    public static void main(String[] args) {
        host host = new host();

        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setRent((rent) host);
        rent proxy = (rent) pih.getProxy();
        proxy.rent();
    }

}


