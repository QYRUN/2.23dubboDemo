package com.qyr.pojo.service;

import com.qyr.pojo.Student;

public interface StudentService {
	//根据ID获取学生
	Student getById(int id);

	//增加年龄
	Student addAge(Student stu, int n);
	
	//减少年龄
	Student minusAge(Student stu,int m);
	
	//乘以年龄
	Student rideusAge(Student stu,int p);
		
	//除以年龄
	Student divdeAge(Student stu,int q);
}
