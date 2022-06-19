package com.docker.springboot.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class HelloDocker {

    @GetMapping(value = "/docker/hello")
    public String helloDocker(){
        return "Hello Docker";
    }

    @GetMapping(value = "/jenkins/hello")
    public String helloJenkins(){
        return "Hello Jenkins";
    }

    @GetMapping(value = "/jenkins/check")
    public String checkJenkins(){
        return "check 1 2 3 4";
    }

}
