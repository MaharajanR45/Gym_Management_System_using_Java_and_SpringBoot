package com.example.UserService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.UserService.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
