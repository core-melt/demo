package com.example.demo.controller;

import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    //@Autowired�A�m�e�[�V������t����ƁASpring Boot�������ŃC���X�^���X��Inject���܂��B
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    // ������org.springframework.ui.Model��ǉ�
    public String getUsers(Model model) {
        List<User> users = userRepository.findAll();
        // Model��users��ǉ�
        model.addAttribute("users", users);
        return "users";
    }
}