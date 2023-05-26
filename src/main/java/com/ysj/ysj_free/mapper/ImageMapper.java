package com.ysj.ysj_free.mapper;

import com.ysj.ysj_free.domain.Image;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ImageMapper {
    void saveImage(Image image);

    List<Image> getAllImage();
}
