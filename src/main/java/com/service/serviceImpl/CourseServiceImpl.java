package com.service.serviceImpl;

import com.dao.CoursetolalMapper;
import com.dao.CourseunitMapper;
import com.dao.CourseunitfileMapper;
import com.dao.CourseunitvideoMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo.*;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CourseServiceImpl {
    String courseinfo;
    @Autowired
    UserServiceImpl userService;

    @Autowired
    CoursetolalMapper coursetolalMapper;

    @Autowired
    CourseunitMapper courseunitMapper;

    @Autowired
    CourseunitvideoMapper courseunitvideoMapper;

    @Autowired
    CourseunitfileMapper courseunitfileMapper;

    public String getallCourse(String username) throws JsonProcessingException {
        List<Coursetolal> coursetolalList = new ArrayList<>();
        User user = userService.findUserByusername(username);
        String courses = user.getCourses();
        String[] split = courses.split("\\,");
        for (String item:split) {
            coursetolalList.add(getCourseByid(Integer.valueOf(item)));
        }
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(coursetolalList);
    }

    public Coursetolal getCourseByid(int courseid){
        CoursetolalExample example = new CoursetolalExample();
        example.createCriteria().andCourseidEqualTo(courseid);
        List<Coursetolal> courses = coursetolalMapper.selectByExample(example);
        Coursetolal coursetolal = courses.get(0);
        return coursetolal;
    }

    public List<Courseunit> getAllunitbycourseid(int id){
        CourseunitExample example = new CourseunitExample();
        example.createCriteria().andCourseidEqualTo(id);
        return courseunitMapper.selectByExample(example);
    }

    public List<Courseunitvideo> getAllVideos(int id){
        CourseunitvideoExample example = new CourseunitvideoExample();
        example.createCriteria().andUnitidEqualTo(id);
        return courseunitvideoMapper.selectByExample(example);
    }
    public List<Courseunitfile> getAllfiles(int id) {
        CourseunitfileExample example = new CourseunitfileExample();
        example.createCriteria().andUnitidEqualTo(id);
        return courseunitfileMapper.selectByExample(example);
    }
    public String getCourseinfo(int courseid) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> videomap = new HashMap<>();
        Map<String,Object> filesmap = new HashMap<>();
        Map<String,Object> unitmap = new HashMap<>();
        List<String> uitname = new ArrayList<>();
        List<Courseunit> courseunitList = getAllunitbycourseid(courseid);
      for (Courseunit item:courseunitList){
          videomap.put(item.getUntiname(),getAllVideos(item.getUnitid()));
          filesmap.put(item.getUntiname(),getAllfiles(item.getUnitid()));
          uitname.add(item.getUntiname());
      }
        unitmap.put("video",videomap);
        unitmap.put("files",filesmap);
        unitmap.put("unitname",uitname);
        courseinfo = objectMapper.writeValueAsString(unitmap);
        return courseinfo;
    }
}
