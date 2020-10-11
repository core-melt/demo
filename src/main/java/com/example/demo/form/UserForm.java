package com.example.demo.form;

import lombok.Data;
//import�ǉ�
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Data
public class UserForm {
    // name�ւ̃o���f�[�V�����ݒ��ǉ�
    @Size(min = 1, max = 200)
    private String name;

    // email�ւ̃o���f�[�V�����ݒ��ǉ�
    @Size(min = 1, max = 200)
    @Email
    private String email;
}