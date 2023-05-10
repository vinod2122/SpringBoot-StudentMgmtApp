package com.vinod.service;

import java.util.List;

import com.vinod.model.Student;

public interface StudentService {
	
	public Student saveStudent(Student s);
	public void deleteStudent(Integer sid);
	public Student getStudent(Integer sid);
	public List<Student> getAllStudent();
	public Student updateStudent(Student student);
	

}
