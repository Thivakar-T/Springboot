package com.socialmedia.socialmedia;
import java.util.*;
public class Teacher {
    private String id;
    private String teacherName;
    private String teacherClassName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherClassName() {
        return teacherClassName;
    }

    public void setTeacherClassName(String teacherClassName) {
        this.teacherClassName = teacherClassName;
    }

    public Teacher(){

    }

    public Teacher(String id, String teacherName, String teacherClassName) {
        this.id = id;
        this.teacherName = teacherName;
        this.teacherClassName = teacherClassName;
    }
}
