package com.example.lab_web.service.impl;

import com.example.lab_web.entity.User;
import com.example.lab_web.mapper.UserMapper;
import com.example.lab_web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getById(Long id) {
        return userMapper.findById(id);
    }

    @Override
    public List<User> list() {
        return userMapper.findAll();
    }

    @Override
    public boolean save(User user) {
        return userMapper.insert(user) > 0;
    }

    @Override
    public boolean update(User user) {
        return userMapper.update(user) > 0;
    }

    @Override
    public boolean remove(Long id) {
        return userMapper.deleteById(id) > 0;
    }
}