package com.devansh.jobtastic.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.devansh.jobtastic.models.JobPost;

public interface JobPostReop extends MongoRepository<JobPost, String>{

}
