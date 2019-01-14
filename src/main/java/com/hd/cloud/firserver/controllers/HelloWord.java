package com.hd.cloud.firserver.controllers;

import javafx.application.Application;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller(value = "/hello")
public class HelloWord {

    @PostMapping(value = "/world")
    public String hello(){
        return "你好啊2";
    }
}
