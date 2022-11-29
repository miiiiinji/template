package com.example.template.controller;

import com.example.template.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final Service service;

    @Autowired
    public Controller(Service service){
        this.service = service;
    }

    @GetMapping(value="/test")
    public String test(){
        return "rest api test2";
    }

    @GetMapping(value="/service/{number}")
    public int getService(@PathVariable int number) {

        int result = service.serviceTemplate(number);
        return result;
    }

}
