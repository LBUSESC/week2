package com.sesc.unistudycircle.service;
import com.sesc.unistudycircle.model.Student;

import java.util.ArrayList;
import java.util.List;

public interface StudentService {

   public Student addStudent(Student student);
   public Student getStudentById(String studentId);
   public List<Student> getAllStudents();

}
