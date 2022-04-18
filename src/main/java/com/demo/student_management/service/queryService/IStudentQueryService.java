package com.demo.student_management.service.queryService;

import com.demo.student_management.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IStudentQueryService {
    List<Student> getAllStudent();
}
