package com.koi.adapter;

/**
 * @author koi
 * @date 2022/7/13 14:49
 */


public class Adapter extends Adaptee implements NetToUsb {
    @Override
    public void handleRequest() {
        super.request();
    }
}
