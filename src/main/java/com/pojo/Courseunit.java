package com.pojo;

public class Courseunit {
    private Integer unitid;

    private String untiname;

    private Integer courseid;

    public Integer getUnitid() {
        return unitid;
    }

    public void setUnitid(Integer unitid) {
        this.unitid = unitid;
    }

    public String getUntiname() {
        return untiname;
    }

    public void setUntiname(String untiname) {
        this.untiname = untiname == null ? null : untiname.trim();
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }
}