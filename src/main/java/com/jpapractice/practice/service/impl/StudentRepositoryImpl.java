package com.jpapractice.practice.service.impl;

import com.jpapractice.practice.entity.Address;
import com.jpapractice.practice.entity.Student;
import com.jpapractice.practice.repository.StudentRepository;
import com.jpapractice.practice.service.StudentService;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentRepositoryImpl implements StudentService {
    private  StudentRepository studentRepository;

    public StudentRepositoryImpl(@Lazy StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student addStudent(Student student) {
        Student student1 = Student.builder()
                .phone(student.getPhone())
                .student_name(student.getStudent_name())
                .address(student.getAddress())
                .build();
         studentRepository.save(student1);
        return student1;
    }

    @Override
    public Student getStudent(int id) {
         return studentRepository.findById(id).get();
    }


}
