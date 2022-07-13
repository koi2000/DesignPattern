package com.koi.adapter;

/**
 * @author koi
 * @date 2022/7/13 14:47
 */
// 客户端类，想上网
public class Computer {
    // 电脑需要转接头才能上网
    public void net(NetToUsb adapter) {
        // 上网的具体实现
        adapter.handleRequest();
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        Adaptee adapter = new Adaptee();
        Adapter ada = new Adapter();
        computer.net(ada);
    }
}
