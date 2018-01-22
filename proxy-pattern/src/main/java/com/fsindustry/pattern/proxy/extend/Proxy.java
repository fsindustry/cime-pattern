package com.fsindustry.pattern.proxy.extend;

/**
 * 代理类
 */
public class Proxy extends RealSubject {

    @Override
    public void request() {

        // 代理操作的实现，可以根据实际扩展，充满想象...
        // 调用方式：同步/异步...
        // 调用时机：立即/延迟...
        // 调用目的：扩展功能、权限控制、过滤...
        before();
        super.request();
        after();
    }

    /**
     * 对目标对象服务的具体定制，可以是一群方法、类、服务...
     */
    public void before() {
        System.out.println("called before request().");
    }

    public void after() {
        System.out.println("called after request().");
    }
}
