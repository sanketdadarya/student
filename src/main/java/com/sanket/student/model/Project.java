package com.sanket.student.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Project {
	@Column @Id
	private String projectNo;
	@Column
	private String projectName;
	@Column
	private int projectDur;
	@Column
	private String projectPlatform;
	public String getProjectNo() {
		return projectNo;
	}
	public void setProjectNo(String projectNo) {
		this.projectNo = projectNo;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public int getProjectDur() {
		return projectDur;
	}
	public void setProjectDur(int projectDur) {
		this.projectDur = projectDur;
	}
	public String getProjectPlatform() {
		return projectPlatform;
	}
	public void setProjectPlatform(String projectPlatform) {
		this.projectPlatform = projectPlatform;
	}
	

}
