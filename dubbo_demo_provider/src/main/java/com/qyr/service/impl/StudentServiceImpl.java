package com.qyr.service.impl;

import com.qyr.pojo.Student;
import com.qyr.pojo.service.StudentService;

public class StudentServiceImpl implements StudentService{

	public Student getById(int id) {
		// TODO Auto-generated method stub
		
		Student student = new Student();
		
		student.setAge(20);
		student.setId(id);
		student.setName("ÕÅÈı"+id);
		
		return student;
	}

	public Student addAge(Student stu, int n) {
		// TODO Auto-generated method stub
		
		stu.setAge(stu.getAge()+n);
		
		return stu;
	}

	public Student minusAge(Student stu, int m) {
		// TODO Auto-generated method stub
		
		stu.setAge(stu.getAge()-m);
		
		return stu;
	}

	public Student rideusAge(Student stu, int p) {
		// TODO Auto-generated method stub
		
		stu.setAge(stu.getAge()*p);
		
		return stu;
	}

	public Student divdeAge(Student stu, int q) {
		// TODO Auto-generated method stub
		
		stu.setAge(stu.getAge()/q);
		
		return stu;
	}

}
