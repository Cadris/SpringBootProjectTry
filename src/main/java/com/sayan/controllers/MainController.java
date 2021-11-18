package com.sayan.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sayan.entities.Project;
import com.sayan.service.ProjectService;

@Controller
public class MainController {
	
	@Autowired
	ProjectService projectService;
	
	@GetMapping("/")
	public String formDisplay() {
		return "addProjectForm";
	}
	
	@PostMapping("addProject")
	public String addProject(@ModelAttribute Project project) {
		System.out.println("New Project added");
		projectService.addProject(project);
		return "addSuccess";
	}
}
