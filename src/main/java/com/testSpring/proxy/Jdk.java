package com.testSpring.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * jdk 动态代理
 */
public class Jdk implements InvocationHandler {

    //做代理的目标对象
    private Object target;

    //带参构造器
    public Jdk(Object target) {
        this.target = target;
    }

    public Object getProxy() {
        /**
         *  返回动态代理
         */

        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                target.getClass().getInterfaces(), this);

    }

    //增强目标角色行为
    public void before(){
        System.out.println("第一次手写动态代理");

    }

    public void after(){
        System.out.println("最后执行的方法");
    }


    /**
     * 执行目标对象的方法
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        before();
        Object result = method.invoke(target,args);
        after();


        return result;
    }
}
