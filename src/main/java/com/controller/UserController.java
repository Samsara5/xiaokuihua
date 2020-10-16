package com.controller;

import com.pojo.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService service;

    @RequestMapping("/allusers")
    public String list(Model model){
        List<User> list = service.getAllUsers();
        model.addAttribute("list",list);
        return "allPages";
    }

}
