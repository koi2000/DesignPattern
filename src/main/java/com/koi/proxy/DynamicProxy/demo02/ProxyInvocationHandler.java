package com.koi.proxy.DynamicProxy.demo02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author koi
 * @date 2022/7/13 16:21
 */
public class ProxyInvocationHandler implements InvocationHandler {

    // 被代理的接口
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }


    // 生成的到代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    // 处理代理实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // 动态代理的本质，即为代理
        log(method.getName());
        Object invoke = method.invoke(target, args);
        return invoke;
    }

    public void log(String msg){
        System.out.println("执行了"+msg+"方法");
    }
}
