package com.sesc.unistudycircle.controller;

import com.sesc.unistudycircle.model.Student;
import com.sesc.unistudycircle.service.StudentService;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {


    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/create")
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        Student studentCreated =  studentService.addStudent(student);
        return new ResponseEntity<>(studentCreated, HttpStatus.CREATED);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable String id) {
        Student student = studentService.getStudentById(id);
        return new ResponseEntity<>(student,HttpStatus.OK);
    }


    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = studentService.getAllStudents();
        return new ResponseEntity<>(students,HttpStatus.OK);
    }

}
