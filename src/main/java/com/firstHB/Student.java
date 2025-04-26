package com.firstHB;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Alok")
public class Student {

	@Id
	private int id;
	private String name; //If you want to change variable/column name in db you can use @Column(name="newname")
	private String course;
	
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
	
	
//	@Entity  //This class objects are eligible to store as a database column
//	@Table(name="Alok") //Hibernate will make table name of Student, @Table will change into name provided
//	public class Student {//pojo : plain old java object (variables are private and values are set by Getters & Setters)
//
//		@Id //It will make id variable as Primary key in db
//		private int id;
//		private String name; //If you want to change varible/column name in db you can use @Column(name="newname")
//		private String course;
	
}
