package com.sayan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sayan.entities.Project;
import com.sayan.repository.ProjectRepository;
import com.sayan.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService{

	@Autowired
	ProjectRepository projectRepository;
	
	@Override
	public Project addProject(Project project) {
		return this.projectRepository.save(project);
	}

}
