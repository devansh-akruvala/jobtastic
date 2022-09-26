package com.devansh.jobtastic.models;

import java.util.Arrays;

import org.springframework.data.mongodb.core.mapping.Document;




@Document("jobpost")
public class JobPost {

	private String profile;
	private String desc;
	private int exp;
	private String techStack[];
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public String[] getTechStack() {
		return techStack;
	}
	public void setTechStack(String[] techStack) {
		this.techStack = techStack;
	}
	@Override
	public String toString() {
		return "JobPost [profile=" + profile + ", desc=" + desc + ", exp=" + exp + ", techStack="
				+ Arrays.toString(techStack) + "]";
	}
	
	
}
