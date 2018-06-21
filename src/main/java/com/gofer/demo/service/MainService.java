package com.gofer.demo.service;

import org.springframework.stereotype.Service;

//@Service
public class MainService {

    private String abc = "";

    public MainService(String abc) {
        this.abc = abc;
    }

    public String getAbc() {
        return abc;
    }
}
