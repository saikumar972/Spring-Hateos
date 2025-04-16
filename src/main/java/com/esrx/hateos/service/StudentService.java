package com.esrx.hateos.service;

import com.esrx.hateos.dao.StudentRepo;
import com.esrx.hateos.entity.Student;
import com.esrx.hateos.response.StudentResponse;
import com.esrx.hateos.response.StudentResponse1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;

    public StudentResponse saveStudent(Student student){
        Student student1= studentRepo.save(student);
        StudentResponse studentResponse=new StudentResponse();
        studentResponse.setId(student1.getId());
        studentResponse.setName(student1.getName());
        return studentResponse;
    }

    public StudentResponse1 saveStudent2(Student student){
        Student student1= studentRepo.save(student);
        StudentResponse1 studentResponse= new StudentResponse1();
        studentResponse.setId(student1.getId());
        studentResponse.setName(student1.getName());
        return studentResponse;
    }

    public Student getStudentById(int id){
        return studentRepo.findById(id).orElseThrow(()->new IllegalArgumentException("invalid id"));
    }
}
