package com.deepanshu.web;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
	@Id
	private int id;
	private String cname;
	private String mentor;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getMentor() {
		return mentor;
	}
	public void setMentor(String mentor) {
		this.mentor = mentor;
	}
	public Course(int id, String cname, String mentor) {
		super();
		this.id = id;
		this.cname = cname;
		this.mentor = mentor;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
}
