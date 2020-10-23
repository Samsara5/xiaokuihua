package com.service.serviceImpl;

import com.dao.UserMapper;
import com.dao.menuMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo.User;
import com.pojo.UserExample;
import com.pojo.menu;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    menuMapper menu;

    @Override
    public List<User> getAllUsers() {
        return userMapper.selectByExample(null);
    }

    @Override
    public void addUser(User u) {
        userMapper.insert(u);
    }

    @Override
    public List<User> findUserById(int id) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUseridEqualTo(id);
        List<User> user = userMapper.selectByExample(userExample);
        return user;
    }

    @Override
    public void updateUser(User u) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andNameEqualTo(u.getName());
        userExample.createCriteria().andUsernameEqualTo(u.getUsername());
        userExample.createCriteria().andPasswordEqualTo(u.getPassword());
        userExample.createCriteria().andPhoneEqualTo(u.getPhone());
        userExample.createCriteria().andEmailEqualTo(u.getEmail());
        userExample.createCriteria().andUniversityidEqualTo(u.getUniversityid());
        userExample.createCriteria().andSexEqualTo(u.getSex());
        userMapper.updateByExample(u,userExample);
    }
    public boolean findUserByusername(String username,String password){
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(username);
        List<User> user = userMapper.selectByExample(userExample);
        User check = user.get(0);
        if (check.getPassword().equals(password))return true;
        return false;
    }

    public User findUserByusername(String username){
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(username);
        List<User> user = userMapper.selectByExample(userExample);
        User check = user.get(0);
        return check;
    }

    public String getmenu() throws JsonProcessingException {
        List<menu> menuList =  menu.selectByExample(null);
        ObjectMapper mapper = new ObjectMapper();
        String res = mapper.writeValueAsString(menuList);
        System.out.println(res);
        return res;
    }

    public String getClassinfo(int Courseid) throws JsonProcessingException {
        List<User> users = userMapper.selectByExample(null);
        List<User> mateinfo = new ArrayList<>();
        for (User u:users) {
            String[] split = u.getCourses().split(",");
            for (String usercourseid:split) {
                if (Integer.valueOf(usercourseid) == Courseid){
                    mateinfo.add(u);
                    break;
                }
            }
        }
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(mateinfo);
    }
}
