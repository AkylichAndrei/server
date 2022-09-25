package com.example.server.controllers;

import com.example.server.models.StudentModel;
import com.example.server.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("studentName/{name}/{lastName}")
    public StudentModel getByData(@PathVariable String name,
                                  @PathVariable String lastName){
        return studentService.getStudent(name, lastName);
    }

    @GetMapping("/create/{name}/{lastName}/{number}")
    public StudentModel create(@PathVariable String name,
                               @PathVariable String lastName,
                               @PathVariable int number){
        StudentModel studentModel = studentService.createStudent(name,
                lastName, number);
        return studentModel;

    }
}
