package com.koi.builder.method1;

/**
 * @author koi
 * @date 2022/7/13 11:48
 */
public class Worker extends Builder {
    Product product;

    public Worker() {
        this.product = new Product();
    }

    @Override
    void buildA() {
        product.setBuildA("A");
    }

    @Override
    void buildB() {
        product.setBuildB("B");
    }

    @Override
    void buildD() {
        product.setBuildC("C");
    }

    @Override
    Product getProduct() {
        return product;
    }
}
