package com.ysj.ysj_free.mapper;

import com.ysj.ysj_free.domain.Image;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ImageMapper {
    void saveImage(Image image);
}
