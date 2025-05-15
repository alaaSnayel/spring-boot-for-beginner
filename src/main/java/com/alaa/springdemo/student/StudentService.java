package com.alaa.springdemo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

  public List<Student> getAllStudents() {
    return List.of(
      new Student(
        "Alaa",
        "Sayed",
        LocalDate.of(1998, 10, 1),
        "alaanayel111@gmail.com",
        26
        ),
      new Student(
        "Diaa",
        "Nayel",
        LocalDate.of(1997, 2, 12),
        "diaanayel@gmail.com",
        28
      ),
      new Student(
        "Wael",
        "Hesham",
        LocalDate.of(1993, 5, 10),
        "waelh298@gmail.com",
        32
      )
    );
  }

}
