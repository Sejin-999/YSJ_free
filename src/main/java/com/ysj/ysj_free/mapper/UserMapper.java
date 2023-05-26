package com.ysj.ysj_free.mapper;

import com.ysj.ysj_free.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
    List<User> getAllUsers();
    void insertUser(User user);
    void updateUser(User user);
    void deleteUser(String id);

    User loginUser(String id , String password);

}
