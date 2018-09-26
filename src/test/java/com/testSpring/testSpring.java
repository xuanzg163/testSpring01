package com.testSpring;

import com.testSpring.dao.TestDao;
import com.testSpring.service.TestService;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSpring {
    @Test
    public void test01(){

        TestService testService = null;
        TestDao testDao = null;

        //调用工厂，加载多个xml文件
        BeanFactory factory = new ClassPathXmlApplicationContext("spring.xml","testDao.xml");
        testService = (TestService) factory.getBean("testService");
        testService.test();

       /* //测试

        BeanFactory factory1 = new ClassPathXmlApplicationContext("testDao.xml");*/
        testDao = (TestDao) factory.getBean("testDao");
        testDao.test();
    }

    @Test
    public void test02(){

        BeanFactory factory = new ClassPathXmlApplicationContext("spring02.xml");
        TestService testService = (TestService) factory.getBean("testService");
        TestDao testDao = (TestDao) factory.getBean("testDao");
        testService.test();
        testDao.test();


    }

    /**
     * 测试bean三种实例化的方式
     */
    @Test
    public void test03(){
        BeanFactory factory = new ClassPathXmlApplicationContext("spring02.xml");
        TestDao testDao = (TestDao) factory.getBean("testDao");
        testDao.test();
    }

    /**
     * 测试set注入
     */
    @Test
    public void test04(){
        BeanFactory factory = new ClassPathXmlApplicationContext("spring03.xml");
        TestService testService = (TestService) factory.getBean("testService");
        testService.test();
    }

    /**
     * 测试构造器注入
     */
    @Test
    public void test05(){
        BeanFactory factory = new ClassPathXmlApplicationContext("spring04.xml");
        TestService testService = (TestService) factory.getBean("testService");
        testService.test();
    }

    /**
     * 测试注解注入
     */
    @Test
    public void test06(){
        BeanFactory factory = new ClassPathXmlApplicationContext("spring05.xml");
        TestService testService = (TestService) factory.getBean("testService");
        testService.test();
    }

}
