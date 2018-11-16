package com.burt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/test")
public class TestController {

    @GetMapping("/msg")
    public String msg() {
        return " service3 msg method return msg";
    }

}
