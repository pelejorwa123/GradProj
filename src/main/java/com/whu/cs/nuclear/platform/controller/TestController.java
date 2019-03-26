package com.whu.cs.nuclear.platform.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: pele
 * @time: 2019/3/23 16:49
 * @project: nuclear-security-info-platform
 * @description:
 */
@RestController
@RequestMapping("test")
public class TestController {
    @RequestMapping("/hello")
    public String test() {
        return "hello,spring";
    }

}
