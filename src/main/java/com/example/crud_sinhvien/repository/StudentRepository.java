package com.example.crud_sinhvien.repository;

import com.example.crud_sinhvien.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
