package com.fsindustry.pattern.proxy.extend;

/**
 * 调用者
 */
public class Client {

    public static void main(String[] args) {

        // 目标对象和代理的创建时间和地点可以不同，此处仅示意
        Proxy proxy = new Proxy();

        // 执行代理方法
        proxy.request();
    }
}
