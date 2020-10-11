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
    
    // �}�b�s���O�ݒ�
    @PostMapping("/newuser")
    public String registerUser(UserForm userForm) {
        // �o���f�[�V�����̌��ʁA�G���[�����邩�ǂ����`�F�b�N
        if (bindingResult.hasErrors()) {
            // �G���[������ꍇ�̓��[�U�[�o�^��ʂ�Ԃ�
            return "newuser";
        }
    	
        // UserForm�̒l��User�N���X�iEntity�j�ɃZ�b�g����
        User user = new User();
        user.setName(userForm.getName());
        user.setEmail(userForm.getEmail());

        // �f�[�^�x�[�X�ɕۑ�
        userRepository.save(user);

        return "redirect:/users";
    }
    
    // deleteUser���\�b�h��ǉ�
    // ���N�G�X�g�}�b�s���O�ݒ��ǉ�
    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable Long id) {
        // �w�肵��ID�̃��[�U�[���폜
        userRepository.deleteById(id);
    	
        return "redirect:/users";
    }
}