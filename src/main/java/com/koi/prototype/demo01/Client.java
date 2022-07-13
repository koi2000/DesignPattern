package com.koi.prototype.demo01;

import java.util.Date;

/**
 * @author koi
 * @date 2022/7/13 12:15
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        // 本方法的话其内的类型为浅拷贝，共享成员
        Video fotilo = new Video("fotilo", new Date());
        System.out.println(fotilo.hashCode());
        Video clone = (Video) fotilo.clone();
        System.out.println(clone.hashCode());
    }

}
