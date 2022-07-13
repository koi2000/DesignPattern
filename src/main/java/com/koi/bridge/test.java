package com.koi.bridge;

import com.koi.adapter.Computer;

/**
 * @author koi
 * @date 2022/7/13 15:10
 */
public class test {

    public static void main(String[] args) {
        computer computer = new Laptop(new Apple());

        computer.info();

        computer computer1 = new Desktop(new lenovo());
        computer1.info();
    }
}
