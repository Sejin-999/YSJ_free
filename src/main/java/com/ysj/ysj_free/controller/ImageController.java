package com.ysj.ysj_free.controller;

import com.ysj.ysj_free.domain.Image;
import com.ysj.ysj_free.domain.User;
import com.ysj.ysj_free.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

@Controller
public class ImageController {
    @Autowired
    private ImageService imageService;

    @PostMapping("/upload/{id}")
    public String uploadImage(@RequestParam("file") MultipartFile file , @PathVariable String id) {
        if (!file.isEmpty()) {
            try {
                byte[] bytes = file.getBytes();
                String fileName = file.getOriginalFilename();
                String filePath = "/Users/yangsejin/Desktop/YSJ_free/src/main/resources/Image/" + fileName;

                // 파일 저장
                Path path = Paths.get(filePath);
                Files.write(path, bytes);

                // 엔티티 생성 및 저장
                Image image = new Image();
                image.setFileName(fileName);
                image.setFilePath(filePath);
                image.setCreatedDate(new Date());
                image.setUserId(id);
                imageService.saveImage(image);

                return "redirect:/";  // 업로드 성공 페이지로 이동
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return "redirect:/error";  // 업로드 실패 페이지로 이동
    }


}
