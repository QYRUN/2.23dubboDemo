package com.qyr.pojo.service;

import com.qyr.pojo.Student;

public interface StudentService {
	//����ID��ȡѧ��
	Student getById(int id);

	//��������
	Student addAge(Student stu, int n);
	
	//��������
	Student minusAge(Student stu,int m);
	
	//��������
	Student rideusAge(Student stu,int p);
		
	//��������
	Student divdeAge(Student stu,int q);
}
