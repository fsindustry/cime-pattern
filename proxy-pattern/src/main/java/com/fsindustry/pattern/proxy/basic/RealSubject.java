package com.fsindustry.pattern.proxy.basic;

/**
 * 被调用者的具体实现
 */
public class RealSubject implements Subject {

    @Override
    public void request() {
        // 服务的具体实现...
        System.out.println("real service is called.");
    }
}
