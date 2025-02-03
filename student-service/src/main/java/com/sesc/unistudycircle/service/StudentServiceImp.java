package com.sesc.unistudycircle.service;

import com.sesc.unistudycircle.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImp implements StudentService {


    List<Student> students = new ArrayList<Student>();

    public Student addStudent(Student student) {
        students.add(student);
        return student;
    }

    public Student getStudentById(String studentId) {

        return students.stream().filter(student -> student
                .getStudentId().equals(studentId)).findFirst().get();
    }

    public List<Student> getAllStudents() {
        return students;
    }

}

