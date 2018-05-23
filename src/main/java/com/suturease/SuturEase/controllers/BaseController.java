package com.suturease.SuturEase.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController {

    @RequestMapping("/crossBow")
    public String crossBow(){
        return "crossBow";
    }
    @RequestMapping("/securusEP")
    public String securusEP(){
        return "securusEP";
    }
    @RequestMapping("/company")
    public String company(){
        return "company";
    }
    @RequestMapping("/contact")
    public String contact(){
        return "contact";
    }
    @RequestMapping("/news")
    public String news(){
        return "news";
    }
    @RequestMapping("/")
    public String baseRoute(){
        return "index";
    }
}
