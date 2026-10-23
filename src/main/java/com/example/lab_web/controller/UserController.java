package com.example.lab_web.controller;

import com.example.lab_web.entity.User;
import com.example.lab_web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    // 查全部
    @GetMapping
    public List<User> list() {
        // 这是 feature 分支
        return userService.list();
    }

    // 查单个
    @GetMapping("/{id}")
    public User get(@PathVariable Long id) {
        return userService.getById(id);
    }

    // 新增
    @PostMapping
    public String add(@RequestBody User user) {
        userService.save(user);
        return "新增成功，ID为：" + user.getId();
    }

    // 修改
    @PutMapping
    public String update(@RequestBody User user) {
        return userService.update(user) ? "修改成功" : "修改失败";
    }

    // 删除
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        return userService.remove(id) ? "删除成功" : "删除失败";
    }
}