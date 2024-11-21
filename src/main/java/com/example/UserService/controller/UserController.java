package com.example.UserService.controller;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.UserService.model.User;
import com.example.UserService.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> saveUser(@RequestBody User user) {
    	User p1 = userService.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(p1);
    }
    
    @GetMapping("/userslist")
	public List<User> getUsers(Model model)  //receiving as a Model
	{
		return userService.getUsers();
	}
    
    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }
    
    @GetMapping("/delete/{id}")
	public Optional<User> deleteUser(@PathVariable Long id)
	{
    	return userService.deleteUser(id);
	}

}
