package com.example.basicrestanddocker.demo.controller;

import com.example.basicrestanddocker.demo.model.HelloWorld;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld")
public class HelloWorldController {

    @GetMapping
    public HelloWorld getHelloWorld() {

        return new HelloWorld(1, "Hello World");
    }


}

