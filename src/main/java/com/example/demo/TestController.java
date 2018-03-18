package com.example.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
class TestController{


    @RequestMapping("/addcard")
    public String addCard(){

        return "addCard new one";
    }
}
