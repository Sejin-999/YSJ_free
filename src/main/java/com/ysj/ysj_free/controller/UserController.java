package com.ysj.ysj_free.controller;

import com.ysj.ysj_free.domain.User;
import com.ysj.ysj_free.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/user")
    public void createUser(@RequestBody User user) {
        userService.insertUser(user);
    }

    @PutMapping("/user/{id}")
    public void updateUser(@PathVariable String id, @RequestBody User user) {
        user.setId(id);
        userService.updateUser(user);
    }

    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable String id) {
        userService.deleteUser(id);
    }
}
