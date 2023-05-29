package com.greatlearning.studentfest.service;

import com.greatlearning.studentfest.entity.Student;

import java.util.List;

public interface StudentService{


    List<Student> getStudentsList();
    Student createNewStudent(Student student);
    Student updateStudent(Integer id, Student student) throws Exception;
    void deleteStudent(Integer id) throws Exception;
    Student getStudentById(Integer id) throws Exception;

}
