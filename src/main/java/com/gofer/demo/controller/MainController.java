package com.gofer.demo.controller;

import com.gofer.demo.service.MainService;
import org.apache.commons.lang3.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.constraints.NotNull;

@Controller
public class MainController {

    private MainService mainService;

    @Autowired
    public MainController(@NotNull MainService mainService) {
        Validate.notNull(mainService);
        if(mainService == null)
            throw new StackOverflowError();

        this.mainService = mainService;
    }

    @RequestMapping("/")
    @ResponseBody
    String home() {

        mainService.getAbc();
        return "Hello World!";
    }


}
