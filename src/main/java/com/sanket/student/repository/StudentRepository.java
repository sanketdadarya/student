package com.sanket.student.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sanket.student.model.Student;
@Repository
public interface  StudentRepository extends JpaRepository<Student, String> {

}
