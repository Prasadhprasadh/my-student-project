package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student;
import com.example.service.StudentService;

@RestController
@RequestMapping("/stu")
public class StudentController {

	@Autowired
	private StudentService studentservice;
	
	
//	@GetMapping("/get")
//	public String getstudent(){
//		return null;
//	}
	
	@PostMapping("/post")
	public Student addstudent(@RequestBody Student student) {
		return studentservice.addstudent(student);
	}
	
}




