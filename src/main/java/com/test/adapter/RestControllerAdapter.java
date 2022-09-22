package com.test.adapter;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/test")
public class RestControllerAdapter {

    private RestControllerHandler handler;

    @GetMapping("/add")
    public String getHolaMundo() {
        return handler.execute() ;
    }


}
