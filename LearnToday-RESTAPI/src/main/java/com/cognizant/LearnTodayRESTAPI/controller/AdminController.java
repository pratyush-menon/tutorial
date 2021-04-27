package com.cognizant.LearnTodayRESTAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import com.cognizant.LearnTodayRESTAPI.model.Course;
import com.cognizant.LearnTodayRESTAPI.service.CourseService;

@RestController 	
public class AdminController {

	@Autowired
	CourseService courseService;
	
//	@RequestMapping("/getallcourses")
//	public ResponseEntity<Object> getAllCourses()
//	{
//		List<Course> l1=courseService.getAllCourses();
//		HttpHeaders responseHeaders = new HttpHeaders();
//		return new ResponseEntity<Object>(l1, responseHeaders, HttpStatus.CREATED);
//	}
//	@RequestMapping("/getCourseById/{id}")
//	public ResponseEntity<Object> getCourseById(@PathVariable int id) {
//		Optional<Course> l1=courseService.getCourseById(id);
//		HttpHeaders responseHeaders = new HttpHeaders();
//		return new ResponseEntity<Object>(l1, responseHeaders, HttpStatus.OK);
//	}
//	
	@PostMapping("/addcourse")
	public void addCourse(@RequestBody Course course) {
		courseService.save(course);
	}
	
	@GetMapping("/Admin")
	public ResponseEntity<Object>  getAllCourses(){
		return new ResponseEntity(courseService.getAllCourses(),HttpStatus.OK);
	}
	@GetMapping("/Admin/{id}")
	public ResponseEntity<Object>  getCourseById(@PathVariable int id){
		Course course=courseService.getCourseByID(id);
		if(course==null) {
			return new ResponseEntity("Searched data not found",HttpStatus.NOT_FOUND);
		}else {
			return new ResponseEntity(course,HttpStatus.OK);
		}
		
	}
	
}
