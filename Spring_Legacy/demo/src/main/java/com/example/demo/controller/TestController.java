package com.example.demo.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.TestService;
import com.example.demo.service.ocService;

@Controller
public class TestController {
    
    @Inject
    TestService testService;
    @Inject
    ocService ocservice;

    @RequestMapping("/test")
    public String testpage(Model model) throws Exception{

        model.addAttribute("testlist", testService.getlist());
        return "test";
    }

    @RequestMapping("t1")
    public String t1(Model model) throws Exception{
        model.addAttribute("testlist", ocservice.getlist());
        return "test";
    }
}
