package com.example.demo.controller;

import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    //@Autowired�A�m�e�[�V������t����ƁASpring Boot�������ŃC���X�^���X��Inject���܂��B
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/newuser")
    // ������Model��ǉ�
    public String getNewUser(Model model) {
       // Model�ɋ��UserForm��ǉ�
       UserForm userForm = new UserForm();
       model.addAttribute("userForm", userForm);
       return "newuser";
    }
}