package com.ysj.ysj_free.controller;

import com.ysj.ysj_free.domain.Image;
import com.ysj.ysj_free.domain.User;
import com.ysj.ysj_free.service.ImageService;
import com.ysj.ysj_free.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PageController {

    private final ImageService imageService;
    @Autowired
    private UserService userService;
    public PageController(ImageService imageService) {
        this.imageService = imageService;
    }

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

    @GetMapping("/images")
    public String showImages(Model model) {
        List<Image> images = imageService.getAllImage(); // 이미지 목록을 가져오는 메소드를 가정
        model.addAttribute("images", images); // images를 모델에 추가
        return "ImageBoard"; // 이미지를 표시할 JSP 페이지의 이름을 반환
    }


}
