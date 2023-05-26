package com.ysj.ysj_free.controller;

import com.ysj.ysj_free.domain.User;
import com.ysj.ysj_free.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class PageController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String home() {

        return "index";
    }
    @GetMapping("/userInsert")
    public String showUserForm() {
        return "UserForm";
    }
    @GetMapping("/page/ImageUpload")
    public String showImageUpload() {
        return "upload";
    }
    @GetMapping("/page/login")
    public String login() {
        return "login";
    }

}
