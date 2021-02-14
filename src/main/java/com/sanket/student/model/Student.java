package com.sanket.student.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table
public class Student {
	
	@Column
	@Id
	private String studentNo;
	@Column
	private String studentName;
	@Column
	private Date studentDOB;
	@Column
	private Date studentDOJ;
	
	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Date getStudentDOB() {
		return studentDOB;
	}
	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}
	public Date getStudentDOJ() {
		return studentDOJ;
	}
	public void setStudentDOJ(Date studentDOJ) {
		this.studentDOJ = studentDOJ;
	}

	

}
