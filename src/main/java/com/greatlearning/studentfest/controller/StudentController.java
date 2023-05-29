package com.greatlearning.studentfest.controller;


import com.greatlearning.studentfest.entity.Student;
import com.greatlearning.studentfest.service.StudentServiceImplimentation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/collegefest")
public class StudentController {


    @Autowired
    StudentServiceImplimentation studentServiceImplimentation;

    @GetMapping("")
    public String redirectToHomePage() {
        return "redirect:/collegefest/students";
    }
    @GetMapping("/students")
    public String getAllStudentsView(Model model) {
        List<Student> studentList =  studentServiceImplimentation.getStudentsList();
        model.addAttribute("studentList", studentList);
        return "index";
    }

    @GetMapping("/students/new")
    public String createStudentView(Model model) {
        Student student = new Student();
        model.addAttribute("newStudent", student);
        return "create";
    }

    @PostMapping("/students/insert")
    public String insertNewStudent(@ModelAttribute Student student) {
        studentServiceImplimentation.createNewStudent(student);
        return "redirect:/collegefest/students";
    }

    @GetMapping("/students/update/{id}")
    public String updateStudentRecord(Model model, @PathVariable Integer id) throws Exception {
        Student student = studentServiceImplimentation.getStudentById(id);
        model.addAttribute("student", student);
        return "edit";
    }

    @PostMapping("/students/update/{id}")
    public String updateStudentRecord(@PathVariable Integer id, @ModelAttribute Student student) throws Exception {
        studentServiceImplimentation.updateStudent(id, student);
        return "redirect:/collegefest/students";
    }

    @GetMapping("/students/delete/{id}")
    public String deleteStudentRecord(@PathVariable("id") Integer id) throws Exception {
        studentServiceImplimentation.deleteStudent(id);
        return "redirect:/collegefest/students";
    }

}
