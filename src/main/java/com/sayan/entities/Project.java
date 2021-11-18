package com.sayan.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Project")
public class Project extends AbstractBaseEntity{

	@Column(name = "Project_Name")
	private String projectName;
	
	@Column(name = "Project_Cost")
	private String projectCost;
	
	public Project() {}

	public Project(String projectName, String projectCost) {
		super();
		this.projectName = projectName;
		this.projectCost = projectCost;
	}

	public String getProjectName() {
		return projectName;
	}

	public String getProjectCost() {
		return projectCost;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public void setProjectCost(String projectCost) {
		this.projectCost = projectCost;
	}
	
	
}
