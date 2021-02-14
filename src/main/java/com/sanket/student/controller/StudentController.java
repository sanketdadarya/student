package com.sanket.student.controller;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sanket.student.model.Student;
import com.sanket.student.services.StudentServices;

@RestController
public class StudentController {
	@Autowired
	StudentServices studentServices;
	@GetMapping("/")
	String print()
	{
		return "server is live";
	}
	
	@PostMapping ("/student")
	Student createStudent(@RequestBody Student student) throws ParseException
	{
		return studentServices.createStudent(student);
	}
	@GetMapping("/student/{studentNo}")
	Optional<Student> readStudent(@PathVariable String studentNo)
	{
		return studentServices.readStudent(studentNo);
	}
	@PutMapping("/student")
	Student updateStudent(@RequestBody Student student)
	{
		return studentServices.updateStudent(student);
	}
	@DeleteMapping("/student/{studentNo}")
	String deleteMapping(@PathVariable String studentNo)
	{
		return studentServices.deleteMapping(studentNo);
	}
	@GetMapping("/studentlist")
	List<Student> viewStudent()
	{
		return studentServices.viewStudent();
	}

}
