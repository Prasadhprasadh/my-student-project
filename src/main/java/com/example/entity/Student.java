package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="details")
public class Student {
	@Id
	private int id;
	private String name;
	private int fees;
	private int age;
	private String male;
	public Student() {
		
	}
	public Student(int id, String name, int fees, int age, String male) {
		//super();
		this.id = id;
		this.name = name;
		this.fees = fees;
		this.age = age;
		this.male = male;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fees=" + fees + ", age=" + age + ", male=" + male + "]";
	}
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
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMale() {
		return male;
	}
	public void setMale(String male) {
		this.male = male;
	}
	
	
}
