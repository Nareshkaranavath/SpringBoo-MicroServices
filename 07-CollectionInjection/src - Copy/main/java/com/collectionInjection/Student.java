package com.collectionInjection;

import java.util.List;
import java.util.Set;

public class Student {

	private Integer id;
	private String name;
	private List<String> courses;
	private Set<String> hobbies;
	

	public Student() {
	System.out.println("Student :: construction");
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	public Set<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(Set<String> hobbies) {
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", courses=" + courses + ", hobbies=" + hobbies + "]";
	}

}
