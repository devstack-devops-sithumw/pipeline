package com.devstack.ci.pipeline.cotroller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("")



public class TestController {

    @GetMapping
    public String test(){
        return "succeed! Test 01";
    }
}
