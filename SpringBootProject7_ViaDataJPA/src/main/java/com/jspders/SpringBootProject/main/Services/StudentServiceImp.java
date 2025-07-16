package com.jspders.SpringBootProject.main.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspders.SpringBootProject.main.entities.Student;
import com.jspders.SpringBootProject.main.repository.StudentRepository;

@Service
public class StudentServiceImp implements StudentService {
	@Autowired
	private StudentRepository studentRepository;
//	It allows Spring to automatically wire the required beans (dependencies) into your classes, 
//	eliminating the need for manual configuration.

	@Override
	public boolean addStudentDetail(Student std) {

		boolean status = false;
		try {
			studentRepository.save(std);
			status = true;
		} catch (Exception e) {
			e.printStackTrace();
			status = false;
		}
		return status;
	}
 
	@Override
	public List<Student> getAllStudentsDetails() {
		
		return studentRepository.findAll();
	}

	@Override
	public Student getStudentsDetails(long id) {
		Optional<Student> optional = studentRepository.findById(id);
		if (optional.isPresent()) 
		{
			return optional.get();
		} 
		else 
		{
			return null;
		}
	}

	@Override
	public boolean updateDeatils(long id, float marks) 
	{
		Student std = getStudentsDetails(id);
		if (std != null) 
		{
			std.setMarks(marks);
			studentRepository.save(std);
			return true;
		} 	
		return false;
	}

	@Override
	public boolean deleteStudent(long id) {
		boolean status = false;
		try 
		{
			studentRepository.deleteById(id);
			status = true;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return status;
	}
}
