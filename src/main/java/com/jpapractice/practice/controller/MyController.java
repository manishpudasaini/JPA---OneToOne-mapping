package com.jpapractice.practice.controller;

import com.jpapractice.practice.entity.Address;
import com.jpapractice.practice.entity.Student;
import com.jpapractice.practice.service.StudentService;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class MyController {
    private StudentService studentService;

    public MyController(@Lazy StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student){

       Student student1 =  studentService.addStudent(student);
        System.out.println(student1);
       return student1;
    }




}
