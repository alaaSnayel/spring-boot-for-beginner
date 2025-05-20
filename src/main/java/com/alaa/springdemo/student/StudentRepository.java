package com.alaa.springdemo.student;

// import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

// we don't need to add this @Repository when we use JpaRepository
public interface StudentRepository extends JpaRepository<Student, Integer> {
  
  Student findByEmail(String email);

  void deleteByEmail(String email);
}
