package com.example.demo;

import org.springframework.web.bind.annotation.*;

/**
 * @Author: panghai
 * @Date: 2022/05/09/21:10
 * @Description: RESTful风格的接口
 */
@RestController
@RequestMapping(value = "/system")
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World!";
    }

    @PostMapping("/how")
    public String how(){
        return "how are you";
    }

    @PutMapping("/put/1")
    public String yes(){
        return "yes";
    }

    @DeleteMapping("/del/2")
    public String bye(){
        return "bye";
    }


}
