package com.example.demo.controller;

import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    //@Autowiredアノテーションを付けると、Spring Bootが自動でインスタンスをInjectします。
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/newuser")
    // 引数にModelを追加
    public String getNewUser(Model model) {
       // Modelに空のUserFormを追加
       UserForm userForm = new UserForm();
       model.addAttribute("userForm", userForm);
       return "newuser";
    }
    
    // マッピング設定
    @PostMapping("/newuser")
    public String registerUser(UserForm userForm) {
        // UserFormの値をUserクラス（Entity）にセットする
        User user = new User();
        user.setName(userForm.getName());
        user.setEmail(userForm.getEmail());

        // データベースに保存
        userRepository.save(user);

        return "redirect:/users";
    }
}