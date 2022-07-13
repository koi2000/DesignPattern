package com.koi.builder.method1;

/**
 * @author koi
 * @date 2022/7/13 11:47
 */
// 抽象的建造者，只提供方法名
public abstract class Builder {
    abstract void buildA();
    abstract void buildB();
    abstract void buildD();

    abstract Product getProduct();

}
