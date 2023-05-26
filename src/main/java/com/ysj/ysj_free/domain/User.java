package com.ysj.ysj_free.domain;

import lombok.Data;

@Data
public class User {
    private String id;
    private String userName;
    private String password;

    public String getUsername() {
        return userName;
    }
}
