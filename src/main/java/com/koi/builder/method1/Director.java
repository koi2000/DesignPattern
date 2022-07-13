package com.koi.builder.method1;

/**
 * @author koi
 * @date 2022/7/13 11:47
 */
// 指挥构建一个工程
public class Director {

    public Product build(Builder builder){
        builder.buildA();
        builder.buildB();
        builder.buildD();
        return builder.getProduct();
    }

}
