package com.koi.proxy.DynamicProxy.demo01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author koi
 * @date 2022/7/13 16:21
 */
public class ProxyInvocationHandler implements InvocationHandler {

    // 被代理的接口
    private rent rent;

    public void setRent(com.koi.proxy.DynamicProxy.demo01.rent rent) {
        this.rent = rent;
    }

    // 生成的到代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
    }

    // 处理代理实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // 动态代理的本质，即为代理
        seeHouse();
        Object invoke = method.invoke(rent, args);
        fare();
        return invoke;
    }

    public void seeHouse(){
        System.out.println("看房子");
    }

    public void fare(){
        System.out.println("收中介费");
    }

}
