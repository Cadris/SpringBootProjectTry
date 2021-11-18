package com.sayan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sayan.entities.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {
		//Enables CRUD Operations via JPA and binds then with the Project datatype as
		//provided in the angle brackets (Generic)
}
