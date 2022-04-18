package com.demo.student_management.repository.commandRepository;

import com.demo.student_management.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IStudentCommandRepository extends JpaRepository<Student, Integer> {
    Student findById(int Id);
}
