package com.socialmedia.socialmedia;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherService {
    List<Teacher> teachers=new ArrayList<Teacher>();
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Teacher> getTeachers(){
        return teachers;
    }

    public Teacher getTeacher( String teacher_id){
        Teacher respose=null;
        for (Teacher teacher:teachers ) {
            if (teacher.getId().equals(teacher_id)){
                respose=teacher;
            }
        }
        return respose;
    }

    public Teacher updateTeacher( Teacher teacher,String teacher_id){
        Teacher response=null;
        for (Teacher teacherObj:teachers) {
            if (teacherObj.getId().equals(teacher_id)){
                teacherObj.setTeacherName(teacher.getTeacherName());
                teacherObj.setTeacherClassName(teacher.getTeacherClassName());
                response=teacherObj;
                break;
            }
        }
        return response;
    }

    public void deleteTeacher(String teacher_id){
        List<Teacher>teacher_obj=new ArrayList<Teacher>();
        for (Teacher teacher:teachers ) {
            if (!teacher.getId().equals(teacher_id)){
                teacher_obj.add(teacher);
            }
        }
        teachers=teacher_obj;
    }
}
