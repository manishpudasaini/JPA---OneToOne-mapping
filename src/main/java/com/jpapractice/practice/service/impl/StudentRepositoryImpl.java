package com.jpapractice.practice.service.impl;

import com.jpapractice.practice.entity.Address;
import com.jpapractice.practice.entity.Student;
import com.jpapractice.practice.repository.StudentRepository;
import com.jpapractice.practice.service.StudentService;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;


@Service
public class StudentRepositoryImpl implements StudentService {
    private  StudentRepository studentRepository;

    public StudentRepositoryImpl(@Lazy StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student addStudent(Student student) {
        Student std = studentRepository.save(student);
        return std;
    }


}
