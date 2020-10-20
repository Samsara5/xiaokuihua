package com.pojo;

public class Course {
    private Integer courseid;

    private String coursename;

    private String coursetecher;

    private Integer coursechapter;

    private Integer courseunit;

    private String coursechapterinfo;

    private String courseunitinfo;

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

    public Integer getCoursechapter() {
        return coursechapter;
    }

    public void setCoursechapter(Integer coursechapter) {
        this.coursechapter = coursechapter;
    }

    public Integer getCourseunit() {
        return courseunit;
    }

    public void setCourseunit(Integer courseunit) {
        this.courseunit = courseunit;
    }

    public String getCoursechapterinfo() {
        return coursechapterinfo;
    }

    public void setCoursechapterinfo(String coursechapterinfo) {
        this.coursechapterinfo = coursechapterinfo == null ? null : coursechapterinfo.trim();
    }

    public String getCourseunitinfo() {
        return courseunitinfo;
    }

    public void setCourseunitinfo(String courseunitinfo) {
        this.courseunitinfo = courseunitinfo == null ? null : courseunitinfo.trim();
    }
}