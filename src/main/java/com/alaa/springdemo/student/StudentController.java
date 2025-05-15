package com.alaa.springdemo.student;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

  
  // Field injection
  // private StudentService service;
  
  // Constructor injection
  private final StudentService service;
  public StudentController(StudentService studentService) {
    this.service = studentService;
  }

  @GetMapping
  public List<Student> getAllStudents() {
    return service.getAllStudents();
  }

}
