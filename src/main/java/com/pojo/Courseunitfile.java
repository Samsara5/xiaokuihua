package com.pojo;

public class Courseunitfile {
    private Integer tecCourseUnitFileid;

    private Integer unitid;

    private String filename;

    private String fileurl;

    public Integer getTecCourseUnitFileid() {
        return tecCourseUnitFileid;
    }

    public void setTecCourseUnitFileid(Integer tecCourseUnitFileid) {
        this.tecCourseUnitFileid = tecCourseUnitFileid;
    }

    public Integer getUnitid() {
        return unitid;
    }

    public void setUnitid(Integer unitid) {
        this.unitid = unitid;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public String getFileurl() {
        return fileurl;
    }

    public void setFileurl(String fileurl) {
        this.fileurl = fileurl == null ? null : fileurl.trim();
    }
}