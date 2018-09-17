package com.example.springboot02.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.example.springboot02.dto.User;
import com.example.springboot02.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    //http://localhost:8080/user/getUser
    @RequestMapping("/getUser")
    public List<User> getUsers() {
        return userService.getUsers();
    }
    //http://localhost:8080/user/addUser?name=luopf
    @RequestMapping("/addUser")
    public void addUser(HttpServletRequest request) {
        String name = request.getParameter("name");
        User user = new User();
        user.setName(name);
        userService.insertUser(user);
    }
    //http://localhost:8080/user/updateUser?id=2&name=luopf01
    @RequestMapping("/updateUser")
    public void updateUser(HttpServletRequest request) {
        String name = request.getParameter("name");
        int id = Integer.parseInt(request.getParameter("id"));
        User user = new User();
        user.setName(name);
        user.setId(id);
        userService.updateUserById(user);
    }
    //http://localhost:8080/user/getUserOne?id=6
    @RequestMapping("/getUserOne")
    public User getUserOne(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        return userService.findUserById(id);
    }
    //http://localhost:8080/user/deleteUser?id=6
    @RequestMapping("/deleteUser")
    public void deleteUser(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        userService.deleteById(id);
    }
}
