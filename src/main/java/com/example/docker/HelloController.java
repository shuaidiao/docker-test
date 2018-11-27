package com.example.docker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenshuai
 * @date 2018/11/19
 */
@RestController
public class HelloController {
    @RequestMapping(value = "/hello")
    String hello() {
        return "hello 2018年11月27日17:15:59";
    }
}
