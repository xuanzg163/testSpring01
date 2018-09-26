package com.testSpring.factory;

import com.testSpring.dao.TestDao;

public class StaticFactory {

    public static TestDao getTestDao(){

//        TestDao testDao = new TestDao();
        return new TestDao();
    }
}
