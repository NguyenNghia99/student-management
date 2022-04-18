package com.demo.student_management.service.queryService.queryServiceImpl;

import com.demo.student_management.entity.Student;
import com.demo.student_management.repository.quyeryRepository.IStudentQueryRepository;
import com.demo.student_management.service.queryService.IStudentQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentQueryService implements IStudentQueryService {

    @Autowired
    private IStudentQueryRepository studentQueryRepository;

    @Override
    public List<Student> getAllStudent() {
        List<Student> output=null;
        output =(List<Student>)studentQueryRepository.findAll();
        return output;
    }
}
