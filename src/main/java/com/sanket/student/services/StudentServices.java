package com.sanket.student.services;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanket.student.model.Student;
import com.sanket.student.repository.StudentRepository;

@Service
public class StudentServices {
	
	@Autowired
	StudentRepository studentRepository;

	public Student createStudent(Student student) throws ParseException {
		return studentRepository.save(student);
	}
	public Optional<Student> readStudent(String studentNo) {
		return studentRepository.findById(studentNo);
	}
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}
	public String deleteMapping(String studentNo) {
		studentRepository.deleteById(studentNo);
		return "deleted successfully";
	}
	public List<Student> viewStudent() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

}
