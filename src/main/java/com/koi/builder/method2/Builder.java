package com.koi.builder.method2;

/**
 * @author koi
 * @date 2022/7/13 11:47
 */
// 抽象的建造者，只提供方法名
public abstract class Builder {
    abstract Builder buildA(String a);
    abstract Builder buildB(String b);
    abstract Builder buildC(String c);

    abstract Product getProduct();

}
