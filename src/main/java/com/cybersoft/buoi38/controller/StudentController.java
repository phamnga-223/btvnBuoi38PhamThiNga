package com.cybersoft.buoi38.controller;

import com.cybersoft.buoi38.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.cybersoft.btvnBuoi38PhamThiNga.entity.Student;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add-v1")
    public ResponseEntity<?> addStudentV1(@RequestParam String name, @RequestParam int age) {
        List<Student> listStudents = new ArrayList<>();
        Student student = studentService.addStudent(name, age);
        listStudents.add(student);

        return new ResponseEntity<>(listStudents, HttpStatus.OK);
    }

    @PostMapping("/add-v2/{name}/{age}")
    public ResponseEntity<?> addStudentV2(@PathVariable String name, @PathVariable int age) {
        List<Student> listStudents = new ArrayList<>();
        Student student = studentService.addStudent(name, age);
        listStudents.add(student);

        return new ResponseEntity<>(listStudents, HttpStatus.OK);
    }

    @PostMapping("/add-v3")
    public ResponseEntity<?> addStudentV3(@RequestBody Student student) {
        List<Student> listStudents = new ArrayList<>();
        listStudents.add(student);

        return new ResponseEntity<>(listStudents, HttpStatus.OK);
    }
}
