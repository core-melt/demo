package com.example.demo.controller;

import org.springframework.stereotype.Controller;
// import�ǉ�
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    // �A�m�e�[�V�����t���̃��\�b�h�ǉ�
    @RequestMapping("/")
    public String index() {
        return "index";
    }
}