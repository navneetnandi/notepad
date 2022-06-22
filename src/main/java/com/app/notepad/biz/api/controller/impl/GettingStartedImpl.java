package com.app.notepad.biz.api.controller.impl;

import com.app.notepad.biz.api.controller.GettingStartedController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GettingStartedImpl implements GettingStartedController {

    @Override
    public String helloWorld() {
        return "Hello World!";
    }
}
