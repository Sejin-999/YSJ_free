package com.ysj.ysj_free.controller;

import com.ysj.ysj_free.domain.User;
import com.ysj.ysj_free.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
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

    @PostMapping("/user/login")
    public String loginUser(@RequestParam String id, @RequestParam String password, HttpSession session) {
        User user = userService.loginUser(id, password);
        if (user != null) {
            session.setAttribute("user", user);
        }
        return "index";
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
