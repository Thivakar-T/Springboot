package com.socialmedia.socialmedia;
import java.util.*;
import org.springframework.web.bind.annotation.*;
import javax.websocket.server.PathParam;
@RestController

public class TeacherApi {
    List <Teacher> teachers=new ArrayList<Teacher>();
    @RequestMapping(method = RequestMethod.POST, value = "/teacher")
    public void addTeacher(@RequestBody Teacher teacher) {
        teachers.add(teacher);
    }
    @RequestMapping(method = RequestMethod.GET,value = "/teacher")
    public List<Teacher> getTeachers(){
        return teachers;
    }

    @RequestMapping(method = RequestMethod.GET,value = "/teacher/{teacher_id}")
    public Teacher getTeacher(@PathVariable("teacher_id") String teacher_id){
        Teacher respose=null;
        for (Teacher teacher:teachers ) {
            if (teacher.getId().equals(teacher_id)){
                respose=teacher;
            }
        }
        return respose;

    }
    
    @RequestMapping(method = RequestMethod.PUT,value = "/teacher/{teacher_id}")
    public Teacher updateTeacher(@RequestBody Teacher teacher,@PathVariable("teacher_id")String teacher_id){
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

    @RequestMapping(method = RequestMethod.DELETE,value = "/teacher/{teacher_id}")
    public void deleteTeacher(@PathVariable("teacher_id")String teacher_id){
        List<Teacher>teacher_obj=new ArrayList<Teacher>();
        for (Teacher teacher:teachers ) {
            if (!teacher.getId().equals(teacher_id)){
                teacher_obj.add(teacher);
            }
        }
        teachers=teacher_obj;
    }
}
