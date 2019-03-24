package com.example.demo.Rest;


import com.example.demo.Domain.Student;
import com.example.demo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/student")
public class StudentApi {

    @Autowired
    private StudentService studentService;

    @GetMapping("/getAllStudents")
    private List<Student> getAllStudents(){
        System.out.println("REST");
        return studentService.getAllStudents();
    }

    @GetMapping("/saveStudent")
     private List<Student> saveStudent(@RequestBody  Student student){
        System.out.println("REST");
        studentService.saveStudent(student);
        return null;
    }

    @GetMapping("/greeting/{myVariable}")
    private String greeting(@PathVariable String myVariable){
        return "Hello " + myVariable;
    }

    @PostMapping("/simplePost/{id}")
    private int postMethod (@RequestBody String s, @PathVariable int id){
        System.out.println(s);
        return id;
    }

}
