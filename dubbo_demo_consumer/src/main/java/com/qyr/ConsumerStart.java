package com.qyr;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qyr.pojo.Student;
import com.qyr.pojo.service.StudentService;

public class ConsumerStart {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
		
		StudentService studentService = context.getBean(StudentService.class);
		
		Student student = studentService.getById(20);
		
		System.out.println("student is "+ student);
		
		Student addAge = studentService.addAge(student, 3);
		System.out.println("加岁数以后" + addAge);
		
		Student minusAge = studentService.minusAge(student, 3);
		System.out.println("减岁数以后" + minusAge);
		
		Student rideusAge = studentService.rideusAge(student, 3);
		System.out.println("乘岁数以后" + rideusAge);
		
		Student divdeAge = studentService.divdeAge(student, 3);
		System.out.println("除岁数以后" + divdeAge);
	}
}
