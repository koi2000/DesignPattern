package com.koi.bridge;

/**
 * @author koi
 * @date 2022/7/13 15:07
 */
// 抽象电脑类
public abstract class computer {

    protected brand brand;

    public computer(com.koi.bridge.brand brand) {
        this.brand = brand;
    }

    public void info(){
        brand.info();
    }
}

class Desktop extends computer{

    public Desktop(com.koi.bridge.brand brand) {
        super(brand);
    }

    @Override
    public void info(){
        brand.info();
        System.out.println("台式机");
    }
}

class Laptop extends computer{

    public Laptop(com.koi.bridge.brand brand) {
        super(brand);
    }

    @Override
    public void info(){
        brand.info();
        System.out.println("笔记本");
    }
}
