package com.koi.builder.method2;

/**
 * @author koi
 * @date 2022/7/13 11:48
 */
public class Worker extends Builder {
    private Product product;

    public Worker() {
        this.product = new Product();
    }

    @Override
    Builder buildA(String a) {
        product.setBuildA(a);
        return this;
    }

    @Override
    Builder buildB(String b) {
        product.setBuildB(b);
        return this;
    }

    @Override
    Builder buildC(String c) {
        product.setBuildC(c);
        return this;
    }

    @Override
    Product getProduct() {
        return product;
    }
}
