package com.example.lab_web.service;

import com.example.lab_web.entity.User;
import java.util.List;

public interface UserService {
    User getById(Long id);
    List<User> list();
    boolean save(User user);
    boolean update(User user);
    boolean remove(Long id);
}