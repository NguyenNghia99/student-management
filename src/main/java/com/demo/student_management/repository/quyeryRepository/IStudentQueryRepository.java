package com.demo.student_management.repository.quyeryRepository;

import com.demo.student_management.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentQueryRepository extends JpaRepository<Student, Integer> {
}
