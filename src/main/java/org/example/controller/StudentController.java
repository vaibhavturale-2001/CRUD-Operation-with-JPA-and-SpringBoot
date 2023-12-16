package org.example.controller;

import org.example.entity.Student;
import org.example.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
   private StudentServiceImpl service;

    @PostMapping("/insertStudent")
    public void insertStudent(@RequestBody Student s1){
        service.insertStudent(s1);
    }
    @PostMapping("/insertMultipleStudent")
    public void insertMultipleStudent(@RequestBody List<Student> studentList){
        service.insertMultipleStudent(studentList);
    }
    @GetMapping("/selectStudent")
    public Student selectStudent(@PathVariable int id){            //Optional used to find find id
        return service.selectStudent(id);                       //if id is not exist then it will return null
    }
    @GetMapping("/selectAllStudent")
    public List<Student> selectAllStudent(){
        return service.selectAllStudent();
    }
    @PutMapping("/updateStudent/{id}")
    public Student updateStudent(@RequestBody Student s1){
        return service.updateStudent(s1);
    }
    @PutMapping("/updateMultipleStudent")
    public List<Student> updateMultipleStudent(@RequestBody List<Student> studentList){
        return service.updateMultipleStudent(studentList);
    }
    @DeleteMapping("/deleteStudent/{id}")
    public Boolean deleteStudent(@PathVariable int id){
        return service.deleteStudent(id);
    }
    @DeleteMapping("/deleteAllStudent")
    public Boolean deleteAllStudent(){
       return service.deleteAllStudent();
    }
}
