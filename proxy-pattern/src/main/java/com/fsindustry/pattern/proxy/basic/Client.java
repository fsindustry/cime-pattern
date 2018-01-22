package com.fsindustry.pattern.proxy.basic;

/**
 * 调用者
 */
public class Client {

    public static void main(String[] args) {

        // 目标对象和代理的创建时间和地点可以不同，此处仅示意
        RealSubject subject = new RealSubject();
        Proxy proxy = new Proxy(subject);

        // 执行代理方法
        proxy.request();
    }
}
