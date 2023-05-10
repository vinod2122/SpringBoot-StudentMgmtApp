package com.vinod.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinod.model.Student;
import com.vinod.repo.StudentRepo;
@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepo repo;
	@Override
	public Student saveStudent(Student s) {
		
		return repo.save(s);
	}

	public void deleteStudent(Integer sid) {
		repo.deleteById(sid);

	}

	@Override
	public Student getStudent(Integer sid) {
		Student s=repo.findById(sid).get();
		return s;
	}
	
	@Override
	public List<Student> getAllStudent(){
		List<Student> std=repo.findAll();
		return std;
	}
	
	@Override
	public Student updateStudent(Student student) {
		Integer stdId = student.getStdId();
		Student std = repo.findById(stdId).get();
		std.setStdName(student.getStdName());
		std.setStdMail(student.getStdMail());
		std.setCourse(student.getCourse());
		std.setFees(student.getFees());
		Student std1=repo.save(std);
		return std1;
	}

}
