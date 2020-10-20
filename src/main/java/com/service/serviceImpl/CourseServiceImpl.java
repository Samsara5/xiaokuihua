package com.service.serviceImpl;

import com.dao.CourseMapper;
import com.pojo.Course;
import com.pojo.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl {
    @Autowired
    CourseMapper courseMapper;

    @Autowired
    UserService userService;

    public List<Course> getAllCourseByuserid(int id){
        List<Course> courseList = courseMapper.selectByExample(null);
        User user= userService.findUserById(id).get(0);
        String courses = user.getCourses();
        String[] split = courses.split(",");
        Course c = new Course();
        int test = 0;
        for (int i=0;i<courseList.size();i++){
            c = courseList.get(i);
            for (int j=0;j<split.length;j++){
                test = Integer.valueOf(split[j]);
                if (test != c.getCourseid()){
                    courseList.remove(i);
                }
            }
        }
        return courseList;
    }
}
