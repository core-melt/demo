package com.example.demo.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class User {

    @Id // user�e�[�u���̃v���C�}���[�L�[id�ɕt����A�m�e�[�V����
    @GeneratedValue(strategy = GenerationType.IDENTITY) // id��MySQL��auto_increment�̏ꍇ�A�������������邽�߂ɃA�m�e�[�V������t����
    private Long id;

    private String name;

    private String email;

}