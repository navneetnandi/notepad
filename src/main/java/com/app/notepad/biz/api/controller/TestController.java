package com.app.notepad.biz.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(path = "/test")
    String helloWorld() throws Exception {
        return "huh!!";
    }
}
