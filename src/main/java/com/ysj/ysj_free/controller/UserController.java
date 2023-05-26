package com.ysj.ysj_free.controller;

import com.ysj.ysj_free.domain.User;
import com.ysj.ysj_free.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
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

    @PostMapping("/user/register")
    public String createUser(@ModelAttribute User user) {

        userService.insertUser(user);
        return "redirect:/page/login";

    }
    @Transactional
    @PostMapping("/user/login")
    public String loginUser(@RequestParam String id, @RequestParam String password, HttpSession session) {
        User user = userService.loginUser(id, password);
        if (user != null) {
            session.setAttribute("user", user);
            return "redirect:/images"; // ImageBoard 페이지로 리다이렉트
        } else {
            return "redirect:/loginFailure"; // 로그인 실패 시 로그인 페이지로 리다이렉트
        }
    }


    @PostMapping("/user/update")
    public String updateUser(@ModelAttribute User user) {
        userService.updateUser(user);
        return "redirect:/images"; // ImageBoard 페이지로 리다이렉트
    }

    @PostMapping("/user/{id}")
    public String deleteUser(@PathVariable String id,HttpSession session) {
        userService.deleteUser(id);
        session.invalidate();
        return "redirect:/";
    }
}
