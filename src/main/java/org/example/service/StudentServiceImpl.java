package org.example.service;

import org.example.entity.Student;
import org.example.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl {
    @Autowired
    private StudentRepo repo;

    public void insertStudent(Student s1){
        repo.save(s1);
    }
    public void insertMultipleStudent(List<Student> studentList){
        repo.saveAll(studentList);
    }
    public Student selectStudent(int id){
        return repo.findById(id).orElse(null);
    }
    public List<Student> selectAllStudent(){
        return repo.findAll();
    }
    public Student updateStudent(Student s1){
        return repo.save(s1);
    }
    public List<Student> updateMultipleStudent(List<Student> studentList){
        return repo.saveAll(studentList);
    }

    public Boolean deleteStudent(int id){
         repo.deleteById(id);
         return true;
    }
    public Boolean deleteAllStudent(){
        repo.deleteAll();
        return true;
    }

}
