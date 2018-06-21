package com.gofer.demo.service;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Service;

//import org.apache.commons.lang3.Validate;

@Service
public class ServiceFactory implements FactoryBean<MainService> {

    @Override
    public MainService getObject() throws Exception {
//        return new MainService("aaa");
        return null;
    }

    @Override
    public Class<?> getObjectType() {
        return MainService.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
