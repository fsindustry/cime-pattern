package com.fsindustry.pattern.proxy.extend;

/**
 * 被调用者的具体实现
 */
public class RealSubject {

    public void request() {
        // 服务的具体实现...
        System.out.println("real service is called.");
    }
}
