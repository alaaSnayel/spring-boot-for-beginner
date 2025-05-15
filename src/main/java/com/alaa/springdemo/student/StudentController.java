package com.alaa.springdemo.student;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

  @GetMapping  
  public List<String> getAllStudents() {
    return List.of("Alaa", "Ali", "Sara");
  }

}
