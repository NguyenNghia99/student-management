package com.demo.student_management.service.commandService.commandServiceImpl;

import com.demo.student_management.entity.Student;
import com.demo.student_management.repository.commandRepository.IStudentCommandRepository;
import com.demo.student_management.service.commandService.IStudentCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentCommandServiceImpl implements IStudentCommandService {

    @Autowired
    public IStudentCommandRepository studentCommandRepository;

    @Override
    public Student createBook(Student studentRequest){
        return studentCommandRepository.save(studentRequest);
    }

    @Override
    public Student updateStudentById(int id, Student studentRequest) {
        Student student = studentCommandRepository.findById(id);
        return studentCommandRepository.save(student);
    }
    @Override
    public boolean deleteStudentById(int id, boolean studentDelete){
        Student student = studentCommandRepository.findById(id);
        studentCommandRepository.delete(student);
        return true;
    }


}
