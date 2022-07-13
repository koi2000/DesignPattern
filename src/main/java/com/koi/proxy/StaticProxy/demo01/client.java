package com.koi.proxy.StaticProxy.demo01;

/**
 * @author koi
 * @date 2022/7/13 15:56
 */

/*
代理模式的好处：
（1）真实角色的的操作更加存粹，不用关注公共业务
（2）公共角色交给代理角色
（3）公共业务便于扩展

步骤
1. 接口
2. 真实角色（业务存粹）
3. 代理角色：处理真实角色业务以及公共业务
*/
public class client {

    public static void main(String[] args) {
        host host = new host();
        proxy proxy = new proxy(host);
        proxy.rent();
    }
}
