package com.esrx.hateos.controller;

import com.esrx.hateos.entity.Student;
import com.esrx.hateos.response.StudentResponse;
import com.esrx.hateos.response.StudentResponse1;
import com.esrx.hateos.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/save")
    public ResponseEntity<StudentResponse> saveStudent(@RequestBody Student student){
        StudentResponse studentResponse= studentService.saveStudent(student);
        Link getStudentIdLink=WebMvcLinkBuilder.linkTo(StudentController.class)
                .slash("/id")
                .slash(studentResponse.getId())
                .withRel("verify")
                .withType("GET");
        studentResponse.add(getStudentIdLink);
        return ResponseEntity.ok(studentResponse);
    }

    @PostMapping("/save1")
    public ResponseEntity<StudentResponse1> saveStudent1(@RequestBody Student student){
        StudentResponse1 studentResponse= studentService.saveStudent2(student);
//        Link getStudentByIdLink=WebMvcLinkBuilder.linkTo(StudentController.class)
//                .slash("/id")
//                .slash(studentResponse.getId())
//                .withRel("verify")
//                .withType("GET");
        Link getStudentByIdLink=Link.of("/student/id/"+studentResponse.getId()).withRel("verify").withType("get");
        studentResponse.addLink(getStudentByIdLink);
        return ResponseEntity.ok(studentResponse);
    }

    @GetMapping("/id/{id}")
    public Student getStudentById(@PathVariable int id ){
        return studentService.getStudentById(id);
    }
}
