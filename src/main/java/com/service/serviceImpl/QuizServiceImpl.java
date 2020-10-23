package com.service.serviceImpl;

import com.dao.questionbankMapper;
import com.dao.questiontotalMapper;
import com.dao.quetiongradeMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class QuizServiceImpl {

    @Autowired
    questionbankMapper bankmapper;

    @Autowired
    questiontotalMapper totalmapper;

    @Autowired
    quetiongradeMapper grademapper;

    @Autowired
    UserServiceImpl userService;
    
    @Autowired
    CourseServiceImpl courseService;

    public List<questionbank> getAllbank(){
        return bankmapper.selectByExample(null);
    }
    public List<quetiongrade> getAllGrade(){
        return grademapper.selectByExample(null);
    }
    public List<questiontotal> getTotal(){
        return totalmapper.selectByExample(null);
    }
    
    public questionbank getBankBybankid(int bankid){
        questionbankExample example = new questionbankExample();
        example.createCriteria().andBankidEqualTo(bankid);
        List<questionbank> tips = bankmapper.selectByExample(example);
        questionbank tip = tips.get(0);
        return tip;
    }

    public questiontotal getTotalBycourseid(int courseid){
        questiontotalExample example = new questiontotalExample();
        example.createCriteria().andCourseidEqualTo(courseid);
        List<questiontotal> totals = totalmapper.selectByExample(example);
        return totals.get(0);
    }
    public quetiongrade getGradeByusername(String username){
        User user = userService.findUserByusername(username);
        quetiongradeExample example = new quetiongradeExample();
        example.createCriteria().andUseridEqualTo(user.getUserid());
        List<quetiongrade> grades = grademapper.selectByExample(example);
        return grades.get(0);
    }
    public String getQuizinfo(int Courseid) throws JsonProcessingException {
        String bankid = getTotalBycourseid(Courseid).getBankid();
        String[] split = bankid.split(",");
        Map<String,Object> quizinfo = new HashMap<>();
        List<questionbank> bankinfo = new ArrayList<>();
        for (String bankiditem:split) {
            bankinfo.add(getBankBybankid(Integer.valueOf(bankiditem)));
        }
        quizinfo.put("bank",bankinfo);
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(quizinfo);
    }
    public String getquizlist(int courseid) throws JsonProcessingException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        questiontotal total = getTotalBycourseid(courseid);
        Coursetolal courseinfo = courseService.getCourseByid(courseid);
        String coursename = courseinfo.getCoursename();
        String coursetecher = courseinfo.getCoursetecher();
        Map<String,Object> quizitem = new HashMap<>();
        Map<String,Object> quizlist = new HashMap<>();
        quizitem.put("coursename",coursename);
        quizitem.put("coursetecher",coursetecher);
        quizitem.put("questionname",total.getQuestionname());
        quizitem.put("questionid",total.getQuestionid());
        quizitem.put("creattime",sdf.format(new Date(String.valueOf(total.getCreattime()))));
        quizitem.put("endtime",sdf.format(new Date(String.valueOf(total.getEndtime()))));
        quizlist.put("quizinfo",quizitem);
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(quizlist);
    }


}
