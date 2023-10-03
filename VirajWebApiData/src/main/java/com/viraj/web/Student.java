package com.viraj.web;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
private int id;
private String name;
private String course;
private long contact;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public long getContact() {
	return contact;
}
public void setContact(long contact) {
	this.contact = contact;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", course=" + course + ", contact=" + contact + "]";
}
public Student(int id, String name, String course, long contact) {
	super();
	this.id = id;
	this.name = name;
	this.course = course;
	this.contact = contact;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}


}
