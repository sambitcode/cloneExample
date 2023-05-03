package com.cloneexample;

public class StudentDeep implements Cloneable {

	String name;
	CourseDeep courses;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CourseDeep getCourses() {
		return courses;
	}

	public void setCourses(CourseDeep courses) {
		this.courses = courses;
	}

	public StudentDeep(String name, CourseDeep courses) {
		super();
		this.name = name;
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "StudentDeep [name=" + name + ", courses=" + courses + "]";
	}

	public Object clone() throws CloneNotSupportedException {
		StudentDeep student = (StudentDeep) super.clone();
		student.courses = (CourseDeep) courses.clone();
		return student;
	}

}
