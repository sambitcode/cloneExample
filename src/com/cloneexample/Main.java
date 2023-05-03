package com.cloneexample;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		//shallowcopy 
		CourseShallow shallowCourses = new CourseShallow("shallow course1", "shallow course1");
		StudentShallow studentShallow1 = new StudentShallow("shallowStudent", shallowCourses);
		StudentShallow studentShallow2 = (StudentShallow) studentShallow1.clone();
		System.out.println("student shallow 1 before update"+studentShallow1);
		System.out.println("student shallow 2 before update"+studentShallow2);
		
		System.out.println();
		System.out.println();
		studentShallow2.getCourses().courseName2 = "updated courseName";
		//updating student 2 courses will reflect in student1 because of shallow copy
		System.out.println("student shallow 1 after update"+studentShallow1);
		System.out.println("student shallow 2 after update"+studentShallow2);
		
		System.out.println();
		System.out.println();
		
		//Deep copy
		CourseDeep DeepCourses = new CourseDeep("Deep course1", "Deep course1");
		StudentDeep studentDeep1 = new StudentDeep("DeepStudent", DeepCourses);
		StudentDeep studentDeep2 = (StudentDeep) studentDeep1.clone();
		System.out.println("student deep 1 before update"+studentDeep1);
		System.out.println("student deep 2 before update"+studentDeep2);
		System.out.println();
		System.out.println();
		studentDeep2.getCourses().courseName2 = "updated courseName";
		//updating student 2 courses will not reflect in student1 because of deep copy
		System.out.println("student deep 1 after update "+studentDeep1);
		System.out.println("student deep 2 after update "+studentDeep2);
	}

}
