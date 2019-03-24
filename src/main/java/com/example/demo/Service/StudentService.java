package com.example.demo.Service;

import com.example.demo.Domain.Student;
import com.example.demo.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        System.out.println("Srevice");
        return studentRepository.getAllStudents();
    }

    public void saveStudent(Student student){
        System.out.println("Srevice save");
        studentRepository.save(student);
    }
}

