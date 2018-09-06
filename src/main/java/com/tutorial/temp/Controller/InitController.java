package com.tutorial.temp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ${file_name}기능명
 *
 * @작성일 : ${date}
 * @작성자 : ${user}
 * @클래스설명 :
 */

//@Controller("InitController")
@RestController
//@RequestMapping("/test")
public class InitController {

//    @RequestMapping("/hello")
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
