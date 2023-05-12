package com.springreact.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotNull;




@Document(collection ="Students")
public class Student {

	
	@Id
	private String id;
//	@NotNull(message = "name shouldn't empty")
	private String name;
	
	private String add;
	
	private String mobile;
	public Student(String id, String name, String add, String mobile) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
		this.mobile = mobile;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", add=" + add + ", mobile=" + mobile + "]";
	}
	
	
	
}
