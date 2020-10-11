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
        // バリデーションの結果、エラーがあるかどうかチェック
        if (bindingResult.hasErrors()) {
            // エラーがある場合はユーザー登録画面を返す
            return "newuser";
        }
    	
        // UserFormの値をUserクラス（Entity）にセットする
        User user = new User();
        user.setName(userForm.getName());
        user.setEmail(userForm.getEmail());

        // データベースに保存
        userRepository.save(user);

        return "redirect:/users";
    }
    
    // deleteUserメソッドを追加
    // リクエストマッピング設定を追加
    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable Long id) {
        // 指定したIDのユーザーを削除
        userRepository.deleteById(id);
    	
        return "redirect:/users";
    }
}