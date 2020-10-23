package com.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.service.serviceImpl.QuizServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    QuizServiceImpl quizService;

    @RequestMapping(value = "/quizinfo",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String getQuzi(@RequestParam(value = "courseid")int courseid) throws JsonProcessingException {
        return quizService.getQuizinfo(courseid);
    }

    @RequestMapping(value = "/quizlist",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String getQuziList(@RequestParam(value = "courseid")int courseid) throws JsonProcessingException {
        return quizService.getquizlist(courseid);
    }


}
