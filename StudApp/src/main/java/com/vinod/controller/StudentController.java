package com.vinod.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinod.model.Student;
import com.vinod.service.StudentService;

@RestController
@CrossOrigin("*")
@RequestMapping("vk")
public class StudentController {
	
	@Autowired
	private StudentService stdServ;
	@PostMapping("/save")
	public Student save(@RequestBody Student student,Model m) {
		Student s=stdServ.saveStudent(student);
		String message=null;
		if(s!=null)
		{
		      message = "Students data save successfully";
		    }
		    else
		    {
		      message ="not save data properly";
		   }
		return s;
	}
	
	@DeleteMapping("/delete/{stdId}")
    public void deleteStudent(@PathVariable Integer stdId) {
        stdServ.deleteStudent(stdId);
    }

    @GetMapping("/get/{stdId}")
    public Student getStudent(@PathVariable Integer stdId) {
        Student student = stdServ.getStudent(stdId);
        return student;
    }
    
	@GetMapping("/getAll")
	public List<Student> getAll() {
		List<Student> std=stdServ.getAllStudent();
		return std;
	}
	
	@PutMapping("/update")
	public Student updateStudent(@RequestBody Student student) {
		Student stud=stdServ.updateStudent(student);
		return stud;
	}

}
