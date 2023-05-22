package com.example.producingwebservice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController
{
    @RequestMapping("/")
    public String hello()
    {
        return "Hello java";
    }

    @RequestMapping("/toto")
    public String toto(){
        return "hello toto";
    }
}
