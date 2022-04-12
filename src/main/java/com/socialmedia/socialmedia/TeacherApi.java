package com.socialmedia.socialmedia;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.websocket.server.PathParam;
@RestController

public class TeacherApi {
    @Autowired
    public TeacherService teacherService;
    @RequestMapping(method = RequestMethod.POST, value = "/teacher")
    public void addTeacher(@RequestBody Teacher teacher) {
        teacherService.addTeacher(teacher);
    }
    @RequestMapping(method = RequestMethod.GET,value = "/teacher")
    public List<Teacher> getTeachers(){
        return teacherService.getTeachers();
    }

    @RequestMapping(method = RequestMethod.GET,value = "/teacher/{teacher_id}")
    public Teacher getTeacher(@PathVariable("teacher_id") String teacher_id){
        return teacherService.getTeacher(teacher_id);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/teacher/{teacher_id}")
    public Teacher updateTeacher(@RequestBody Teacher teacher,@PathVariable("teacher_id")String teacher_id){
        return teacherService.updateTeacher(teacher,teacher_id);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/teacher/{teacher_id}")
    public void deleteTeacher(@PathVariable("teacher_id")String teacher_id){
      teacherService.deleteTeacher(teacher_id);
    }
}
