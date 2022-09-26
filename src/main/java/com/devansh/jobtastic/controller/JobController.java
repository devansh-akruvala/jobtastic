package com.devansh.jobtastic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devansh.jobtastic.models.JobPost;
import com.devansh.jobtastic.repo.JobPostReop;

@RestController
public class JobController {

	
	@Autowired
	JobPostReop repo;
	
	@GetMapping("/posts")
	public List<JobPost> getAllPost(){
		return repo.findAll();
	}
}
