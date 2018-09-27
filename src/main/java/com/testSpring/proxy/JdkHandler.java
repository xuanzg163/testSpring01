package com.testSpring.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK 动态代理
 * 程序运行期，创建对象
 */
public class JdkHandler implements InvocationHandler {

    //做代理的目标对象
    private Object target;

    public JdkHandler(Object target) {
        this.target = target;
    }

    /**
     * 获取动态代理对象
     */
    public Object getProxy() {

        /**
         *  返回动态代理
         *      参数1 类加载器
         *      参数2 目标对象实现的接口数组
         *      参数3 实现invocationHandler 接口的类对象
         */


        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                target.getClass().getInterfaces(), this);
    }

    //增强目标角色行为
    public void before() {
        System.out.println("开始变强");
    }

    //增强目标角色行为
    public void after() {
        System.out.println("结束变强");
    }

    /**
     *  执行目标对象方法
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {

        before();
        Object result = method.invoke(target, args);
        after();

        return result;
    }

}
