package com.example.demo.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.data.entity.User;

// JpaRepository�C���^�[�t�F�C�X���p��
public interface UserRepository extends JpaRepository<User, Long> {

}