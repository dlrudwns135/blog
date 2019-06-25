package com.tutorial.temp.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * FrontController기능명
 *
 * @작성일 : 19.06.25
 * @작성자 : leekj
 * @클래스설명 :
 */
@Controller
public class FrontController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value="/")
    public String index(){
        return "index";
    }
}
