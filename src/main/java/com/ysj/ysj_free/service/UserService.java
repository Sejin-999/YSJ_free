package com.ysj.ysj_free.service;

import com.ysj.ysj_free.domain.User;
import com.ysj.ysj_free.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }

    public void insertUser(User user) {
        userMapper.insertUser(user);
    }

    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    public void deleteUser(String id) {
        userMapper.deleteUser(id);
    }

    public User loginUser(String id , String password) {
        User user = userMapper.loginUser(id , password);
        return user;
    }


}
