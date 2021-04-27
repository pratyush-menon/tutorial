package com.cognizant.LearnTodayRESTAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import com.cognizant.LearnTodayRESTAPI.model.Course;
import com.cognizant.LearnTodayRESTAPI.model.CourseComparator;
import com.cognizant.LearnTodayRESTAPI.model.Student;
import com.cognizant.LearnTodayRESTAPI.service.CourseService;
import com.cognizant.LearnTodayRESTAPI.service.StudentService;

@RestController 	
public class StudentController {

	@Autowired
	CourseService courseService;
	
	@Autowired
	StudentService studentService;
	

	@GetMapping("/api/Student")
	public ResponseEntity<Object>  getAllCoursesStudent(){
		List<Course> courseList = courseService.getAllCourses();
		Collections.sort(courseList,new CourseComparator());
		return new ResponseEntity(courseList,HttpStatus.OK);
	}
	
	@PostMapping("/api/Student")
	public ResponseEntity<Object> postStudent(@RequestBody Student student) {
		try{
			studentService.save(student);
			return new ResponseEntity(HttpStatus.CREATED);
		}catch(Exception e) {
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
	}
	
	@DeleteMapping("/api/Student/{id}")
	public ResponseEntity<Object> deleteStudentEnrollment(@PathVariable int id){
		Student student = studentService.getStudentByID(id);
		
		if(student==null) {
			return new ResponseEntity("No enrollement information found",HttpStatus.NOT_FOUND);
		}else {
			studentService.deleteStudent(id);
			return new ResponseEntity(HttpStatus.OK);
		}
		
	}

	
}
