package cn.itrip.auth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "hello")
public class HelloController {

    @RequestMapping(value = "/")
    @ResponseBody
    public String hello() {
        return "hello lpp";
    }
}