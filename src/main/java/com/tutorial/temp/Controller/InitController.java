package com.tutorial.temp.Controller;

import com.tutorial.temp.Class.User;
import com.tutorial.temp.DTO.UserDTO;
import com.tutorial.temp.Repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * ${file_name}기능명
 *
 * @작성일 : ${date}
 * @작성자 : ${user}
 * @클래스설명 :
 */

//@Controller("InitController")
@RestController
public class InitController {

    private UserRepository userRepository;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "hello";
    }

    @RequestMapping(value="/save", method= RequestMethod.POST)
    public void save(@RequestBody UserDTO userDto){
        userRepository.save(userDto.toEntity());
    }
}
