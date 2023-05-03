package com.cloneexample;

public class StudentShallow implements Cloneable{
	
	String name;
	CourseShallow courses;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public CourseShallow getCourses() {
		return courses;
	}
	public void setCourses(CourseShallow courses) {
		this.courses = courses;
	}
	public StudentShallow(String name, CourseShallow courses) {
		super();
		this.name = name;
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "StudentShallow [name=" + name + ", courses=" + courses + "]";
	}
	
	public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

}
