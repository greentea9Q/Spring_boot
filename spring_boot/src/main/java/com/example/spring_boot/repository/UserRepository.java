package com.example.spring_boot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring_boot.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    // ユーザー名で完全一致検索
    List<User> findByUserName(String userName);
}