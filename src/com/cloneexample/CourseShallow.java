package com.cloneexample;

public class CourseShallow {
	String courseName1;
	String courseName2;
	public String getCourseName1() {
		return courseName1;
	}
	public void setCourseName1(String courseName1) {
		this.courseName1 = courseName1;
	}
	public String getCourseName2() {
		return courseName2;
	}
	public void setCourseName2(String courseName2) {
		this.courseName2 = courseName2;
	}
	public CourseShallow(String courseName1, String courseName2) {
		super();
		this.courseName1 = courseName1;
		this.courseName2 = courseName2;
	}
	@Override
	public String toString() {
		return "CourseDeep [courseName1=" + courseName1 + ", courseName2=" + courseName2 + "]";
	}

	
}
