package com.ysj.ysj_free.service;

import com.ysj.ysj_free.domain.Image;
import com.ysj.ysj_free.mapper.ImageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageService {
    @Autowired
    private ImageMapper imageMapper;

    public void saveImage(Image image) {
        imageMapper.saveImage(image);
    }

    public List<Image> getAllImage(){
        return imageMapper.getAllImage();
    }


}
