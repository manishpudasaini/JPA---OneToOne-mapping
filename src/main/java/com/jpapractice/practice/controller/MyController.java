package com.jpapractice.practice.controller;

import com.jpapractice.practice.entity.Address;
import com.jpapractice.practice.entity.Student;
import com.jpapractice.practice.repository.AddressRepository;
import com.jpapractice.practice.service.AddressService;
import com.jpapractice.practice.service.StudentService;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    private StudentService studentService;
    private final AddressService addressService;

    public MyController(@Lazy StudentService studentService, AddressService addressService) {
        this.studentService = studentService;
        this.addressService = addressService;
    }


    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student){

       Student student1 =  studentService.addStudent(student);
        //System.out.println(student1);
       return student1;
    }

    @PostMapping("/address")
    public Address addAddress(@RequestBody Address address){
        Address address1 = addressService.addAddress(address);
        return address1;
    }


    @GetMapping("/student/get/{id}")
    public Student getStudent(@PathVariable int id){
        Student std = studentService.getStudent(id);
        //System.out.println(std);
        return std;
    }




}
