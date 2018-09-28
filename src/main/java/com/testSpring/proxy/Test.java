package com.testSpring.proxy;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        /*new ClassPathXmlApplicationContext("jobservice.xml");*/

        new ClassPathXmlApplicationContext("jobservice02.xml");
    }
}
