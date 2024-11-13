package com.cybersoft.buoi38.service;

import com.cybersoft.btvnBuoi38PhamThiNga.entity.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    public Student addStudent(String name, int age) {
        Student student = new Student();
        student.setName(name);
        student.setAge(age);

        return student;
    }
}
