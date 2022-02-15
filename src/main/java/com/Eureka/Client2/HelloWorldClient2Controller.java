package com.Eureka.Client2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldClient2Controller {

    @GetMapping("/hello-worlds/{name}")
    public String getHelloWorld (@PathVariable String name)
    {
        return "Hello World Client 2 "+name;
    }

}
