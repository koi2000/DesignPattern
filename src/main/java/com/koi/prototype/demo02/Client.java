package com.koi.prototype.demo02;

import java.util.Date;

/**
 * @author koi
 * @date 2022/7/13 12:15
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        // 修改为深克隆
        Video fotilo = new Video("fotilo", new Date());
        System.out.println(fotilo.hashCode());
        Video clone = (Video) fotilo.clone();
        System.out.println(clone.hashCode());
    }

}
