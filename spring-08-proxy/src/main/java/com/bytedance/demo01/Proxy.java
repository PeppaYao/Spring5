package com.bytedance.demo01;

public class Proxy implements Rent{
    private Host host;

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent() {
        seeHouse();
        getContract();
        host.rent();

    }

    public void seeHouse(){
        System.out.println("中介带你看房");
    }
    public void getContract(){
        System.out.println("中介和你签合同");
    }
}
