package com.testSpring;

import com.testSpring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTesting {

    /**
     *  测试自动扫描，注解加载
     */
    @Test
    public void test(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring06.xml");
        UserService userService = (UserService) ac.getBean("userService");
        userService.test();
    }
}
