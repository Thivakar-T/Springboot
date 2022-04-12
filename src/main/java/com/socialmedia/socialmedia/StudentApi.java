package com.socialmedia.socialmedia;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.websocket.server.PathParam;
@RestController
public class StudentApi {
    @Autowired
    public  StudentService studentService;
    @RequestMapping(method = RequestMethod.POST, value = "/student")
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/student")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/student/{student_id}")
    public Student getStudent(@PathVariable("student_id") String student_id) {
        return studentService.getStudent(student_id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/student/{student_id}")
    public Student updateStudent(@RequestBody Student student, @PathVariable("student_id") String student_id) {
        return studentService.updateStudent(student,student_id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/student/{student_id}")
    public void deleteStudent(@PathVariable("student_id") String student_id) {
        studentService.deleteStudent(student_id);
    }
}
