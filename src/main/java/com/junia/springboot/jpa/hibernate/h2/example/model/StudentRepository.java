package com.junia.springboot.jpa.hibernate.h2.example.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.junia.springboot.jpa.hibernate.h2.example.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
