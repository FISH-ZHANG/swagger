package com.study.swagger.controller;

import com.study.swagger.bean.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Api(value = "用户模块", description = "用于处理用户相关的操作")
@RequestMapping("/user")
public class UserController {

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User("张三", "123456"));
        users.add(new User("李四", "12345"));
    }

    @GetMapping("/userList")
    @ApiOperation(value = "获取用户列表", notes = "返回用户列表")
    public Object userList() {
        Map<String, Object> map = new HashMap<>();
        map.put("users", users);
        return map;
    }

    @GetMapping("getUserByID")
    @ApiOperation(value = "获取单个用户", notes = "根据用户ID获取用户信息")
    @ApiImplicitParam(value = "用户的ID")
    public User getUserByID(@RequestParam("id") int id) {
        System.out.println(id);
        return users.get(id);
    }

}
