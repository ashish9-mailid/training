package com.training.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.training.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUsername(String username);
}
