package com.testSpring.factory;

import com.testSpring.dao.TestDao;

public class Factory {

    public TestDao getTestDao(){

        return new TestDao();
    }
}
