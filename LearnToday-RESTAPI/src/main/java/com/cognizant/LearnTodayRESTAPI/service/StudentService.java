package com.cognizant.LearnTodayRESTAPI.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.LearnTodayRESTAPI.model.Course;
import com.cognizant.LearnTodayRESTAPI.model.Student;
import com.cognizant.LearnTodayRESTAPI.repository.StudentRepository; 

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studRepo;
	
	public void save(Student student) {
		studRepo.save(student);
	}
	
	public Student getStudentByID(int id) {
		Student student=null;
		Optional<Student> s= studRepo.findById(id);
		if(s.isPresent()) {
			student=s.get();
		}
		return student;
	}
	
	public void deleteStudent(int id) {
		studRepo.deleteById(id);
	}

}
