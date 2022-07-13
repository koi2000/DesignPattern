package com.koi.builder.method2;

/**
 * @author koi
 * @date 2022/7/13 11:58
 */
public class test {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.buildA("1").buildB("2").buildC("3");
        System.out.println(worker.getProduct());
    }
}
