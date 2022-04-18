package com.demo.student_management.service.commandService;

import com.demo.student_management.entity.Student;


public interface IStudentCommandService {
    Student createBook(Student bookRequest);

    Student updateStudentById(int id, Student studentRequest);

    boolean deleteStudentById(int id, boolean studentRequest);
}
