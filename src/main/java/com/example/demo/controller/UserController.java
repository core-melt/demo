package com.example.demo.controller;

import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    //@Autowiredアノテーションを付けると、Spring Bootが自動でインスタンスをInjectします。
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    // 引数にorg.springframework.ui.Modelを追加
    public String getUsers(Model model) {
        List<User> users = userRepository.findAll();
        // Modelにusersを追加
        model.addAttribute("users", users);
        return "users";
    }
}