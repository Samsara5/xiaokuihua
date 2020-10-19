package com.controller;

import com.pojo.Message;
import com.pojo.User;
import com.service.UserService;
import com.utils.Token;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping("/index")
public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public Message login(@RequestParam(value = "username")String username,@RequestParam(value="password")String password){
       String t =  Token.token(username,password);
       if (userService.findUserByusername(username,password)){
           return Message.success().add("token",t);
       }
       return Message.fail();
    }

    @RequestMapping("/regist")
    @ResponseBody
    public Message addUser(@RequestParam(value = "username")String username,
                           @RequestParam(value = "password")String password,
                           @RequestParam(value = "name")String name,
                           @RequestParam(value = "phone")String phone,
                           @RequestParam(value = "email")String email,
                           @RequestParam(value = "universityid")int universityid,
                           @RequestParam(value = "sex")int sex){
        User user = new User();
        user.setName(name);
        user.setUsername(username);
        user.setPassword(password);
        user.setPhone(phone);
        user.setEmail(email);
        user.setUniversityid(universityid);
        user.setSex(sex);
        user.setAddtime(new Date());
        user.setDepartment(1);
        userService.addUser(user);
        return Message.success();
    }
}
