package com.example.demo.controller;

import org.springframework.stereotype.Controller;
// import追加
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    // アノテーション付きのメソッド追加
    @RequestMapping("/")
    public String index() {
        return "index";
    }
}