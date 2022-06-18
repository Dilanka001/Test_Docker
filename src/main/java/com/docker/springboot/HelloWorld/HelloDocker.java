package com.docker.springboot.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/docker")
public class HelloDocker {

    @GetMapping(value = "/hello")
    public String helloDocker(){
        return "Hello Docker";
    }

}
