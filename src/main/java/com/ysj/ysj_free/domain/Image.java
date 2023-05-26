package com.ysj.ysj_free.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Image {
    private Long seq;
    private String fileName;
    private String filePath;
    private Date createdDate;
    private String UserId;
}
