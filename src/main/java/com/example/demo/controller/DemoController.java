package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sk
 */
@RestController
public class DemoController {

    @GetMapping("/hello")
    public String hello(){
        return "success";
    }
}
