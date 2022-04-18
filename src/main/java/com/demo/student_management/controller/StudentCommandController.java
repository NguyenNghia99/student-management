package com.demo.student_management.controller;

import com.demo.student_management.entity.Student;
import com.demo.student_management.service.commandService.IStudentCommandService;
import com.demo.student_management.service.queryService.IStudentQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentCommandController {

    @Autowired
    public IStudentCommandService studentCommandService;

    @Autowired
    private IStudentQueryService studentQueryService;

    @PostMapping("/create")
    public ResponseEntity<Student> createBook(@Valid @RequestBody Student studentRequest){
        return new ResponseEntity<>(studentCommandService.createBook(studentRequest), HttpStatus.CREATED);
    }

    @GetMapping("/student")
    public ResponseEntity<Object> getAllStudent(){
        List<Student> students = studentQueryService.getAllStudent();
        return new ResponseEntity<Object>(students,HttpStatus.OK);
    }

    @PutMapping("/editById/{id}")
    public ResponseEntity<Student> updateStudentById(@PathVariable int id,@Valid @RequestBody Student studentRequest){
        return new ResponseEntity<>(studentCommandService.updateStudentById(id,studentRequest),HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteStudentById(@PathVariable int id){
        studentCommandService.deleteStudentById(id,true);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}
