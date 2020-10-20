package com.controller;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo.Message;
import com.pojo.User;
import com.service.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @RequestMapping(value = "/menus",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String getmuns() throws JsonProcessingException {
        String res = "{\"data\":[{\"id\":125,\"authName\":\"我的课程\",\"path\":\"users\",\"children\":[{\"id\":110,\"authName\":\"我的课程\",\"path\":\"users\",\"children\":[],\"order\":null}],\"order\":1},{\"id\":103,\"authName\":\"我的班级\",\"path\":\"rights\",\"children\":[{\"id\":111,\"authName\":\"班级信息\",\"path\":\"roles\",\"children\":[],\"order\":null},{\"id\":112,\"authName\":\"老师信息\",\"path\":\"rights\",\"children\":[],\"order\":null}],\"order\":2},{\"id\":101,\"authName\":\"我的学习\",\"path\":\"goods\",\"children\":[{\"id\":104,\"authName\":\"我的考试\",\"path\":\"goods\",\"children\":[],\"order\":1},{\"id\":115,\"authName\":\"我的小组\",\"path\":\"params\",\"children\":[],\"order\":2},{\"id\":121,\"authName\":\"我的笔记\",\"path\":\"categories\",\"children\":[],\"order\":3}],\"order\":3},{\"id\":102,\"authName\":\"我的作业\",\"path\":\"orders\",\"children\":[{\"id\":107,\"authName\":\"我的作业\",\"path\":\"orders\",\"children\":[],\"order\":null}],\"order\":4},{\"id\":145,\"authName\":\"学习统计\",\"path\":\"reports\",\"children\":[{\"id\":146,\"authName\":\"学习数据\",\"path\":\"reports\",\"children\":[],\"order\":null}],\"order\":5}],\"meta\":{\"msg\":\"获取菜单列表成功\",\"status\":200}}";
        return res;
    }

    @RequestMapping(value = "/userinfo",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String getuserinfo(@RequestParam(value = "username")String username) throws JsonProcessingException {
        User userinfo = userService.findUserByusername(username);
        ObjectMapper oj = new ObjectMapper();
        String userjson = oj.writeValueAsString(userinfo);
        return userjson;
    }
}
