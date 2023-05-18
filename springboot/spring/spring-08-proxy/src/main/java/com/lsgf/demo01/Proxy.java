package com.lsgf.demo01;

//代理
public class Proxy implements Rent {
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        seeHouse();
        this.host = host;
        signContext();
        fare();
    }

    @Override
    public void rent() {
        host.rent();
    }

    public void seeHouse(){
        System.out.println("中介带你看房");
    }

    public void fare(){
        System.out.println("收中介费");
    }

    public void signContext(){
        System.out.println("签合同");
    }
}
