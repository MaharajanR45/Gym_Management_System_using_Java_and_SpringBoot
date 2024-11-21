package com.example.UserService.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.UserService.dao.UserRepository;
import com.example.UserService.model.User;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }
    
    public List<User> getUsers()
	{
		return userRepository.findAll(); 
	}

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }
    
    public Optional<User> deleteUser(Long id)
	{
		userRepository.deleteById(id);
		return null;
	}
    
}
