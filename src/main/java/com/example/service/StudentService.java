package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Student;
import com.example.repository.StudentRepo1;

@Service
public class StudentService {

	@Autowired
	private StudentRepo1 studentrepo;
	
	
	
	public Student addstudent(Student s) {
		return studentrepo.save(s);
	}
}
