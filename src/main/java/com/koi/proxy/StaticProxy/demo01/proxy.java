package com.koi.proxy.StaticProxy.demo01;

/**
 * @author koi
 * @date 2022/7/13 15:57
 */
public class proxy implements rent{

    private host host;

    public proxy() {
    }

    public proxy(com.koi.proxy.StaticProxy.demo01.host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        host.rent();
    }

    public void seeHouse(){
        System.out.println("看房");
    }

    public void sign(){
        System.out.println("合同");
    }
}
