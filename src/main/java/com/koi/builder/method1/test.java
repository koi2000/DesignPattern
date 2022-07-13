package com.koi.builder.method1;

/**
 * @author koi
 * @date 2022/7/13 11:58
 */
public class test {
    public static void main(String[] args) {
        Director director = new Director();
        Product build = director.build(new Worker());
        System.out.println(build);
    }
}
