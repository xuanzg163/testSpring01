package com.testSpring;

import com.testSpring.proxy.*;
import org.junit.Test;

/**
 *  测试代理方法
 */
public class testProxy {

    /**
     * 测试静态代理
     *
     */
    @Test
    public void test01(){

        //实例化代理人
        new MarryCompany(new You()).toMarry();
    }

    /**
     *  测试JDK动态代理
     */
    @Test
    public void test02(){
        JdkHandler jdkHandler = new JdkHandler(new You());
        Marry marry = (Marry) jdkHandler.getProxy();
        marry.toMarry();
    }



    /**
     *  测试手写JDK动态代理
     */
    @Test
    public void test03(){
        Jdk jdk = new Jdk(new You());
        Marry marry = (Marry) jdk.getProxy();
        marry.toMarry();
    }
}
