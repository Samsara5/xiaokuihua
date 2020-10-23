package com.pojo;

public class Coursetolal {
    private Integer courseid;

    private String coursename;

    private String coursetecher;

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename == null ? null : coursename.trim();
    }

    public String getCoursetecher() {
        return coursetecher;
    }

    public void setCoursetecher(String coursetecher) {
        this.coursetecher = coursetecher == null ? null : coursetecher.trim();
    }
}