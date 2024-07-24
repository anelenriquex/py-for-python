package com.anel.darabeis.controllers;

import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.anel.darabeis.entities.student;
import com.anel.darabeis.repositories.studentRepository;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class studentControllers {

    private final studentRepository studentRepository;  

        
    public studentControllers(studentRepository studentRepository){
        this.studentRepository = studentRepository;

    }

@GetMapping("/users")
public List<student> users(){

    return studentRepository.findAll();
}

}
