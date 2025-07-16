package com.jspders.SpringBootProject.main;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jspders.SpringBootProject.main.Services.StudentService;
import com.jspders.SpringBootProject.main.Services.StudentServiceImp;
import com.jspders.SpringBootProject.main.entities.Student;

@SpringBootApplication
public class SpringBootWithDataJpa1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootWithDataJpa1Application.class, args);
		StudentService studentService = context.getBean(StudentServiceImp.class);
//		----------------- INSERTION -----------------
//		Student student = new Student();
//		student.setName("Amit");
//		student.setRollno(102);
//		student.setMarks(83.78f);
//		boolean status = studentService.addStudentDetail(student);
//		if (status) 
//		{
//			System.out.println("Student Inserted Succesfully");
//		} else 
//		{
//			System.out.println("Student Inserted Succesfully");
//		}
		
//		----------------- SELECT OPERATION (FOR ALL) -----------------
//		List<Student> list = studentService.getAllStudentsDetails();
//		for (Student student : list) {
//			System.out.println("ROLLNO : "+ student.getRollno());
//			System.out.println("NAME : "+ student.getName());
//			System.out.println("MARKS : "+ student.getMarks());
//			System.out.println("__________________________________");
//		} 

//		----------------- SELECT OPERATION (FOR ONLY ONE) -----------------
//		Student std = studentService.getStudentsDetails(2L);
//		if (std != null) 
//		{
//			System.out.println("ID : "+ std.getId());
//			System.out.println("NAME : "+ std.getName());
//			System.out.println("MARKS : "+ std.getMarks());
//			System.out.println("__________________________________");
//		} 
//		else 
//		{
//			System.out.println("Student not Found!!");
//		}
		
//		----------------- UPDATE OPERATION (FOR ALL) -----------------//
//		boolean status = studentService.updateDeatils(2L, 20);
//		if (status) 
//		{
//			System.out.println("Student Upadated");
//		} 
//		else 
//		{
//			System.out.println("Student Not Upadated");
//		}
	

//		----------------- DELETE OPERATION (FOR ALL) -----------------//
		boolean status = studentService.deleteStudent(2L);
		if (status) 
		{
			System.out.println("Student Deleted");
		} 
		else 
		{
			System.out.println("Student Not Deleted");
		}

	}

} 
