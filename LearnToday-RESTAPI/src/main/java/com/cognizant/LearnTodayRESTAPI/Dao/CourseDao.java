package com.cognizant.LearnTodayRESTAPI.Dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cognizant.LearnTodayRESTAPI.model.Course;
import com.cognizant.LearnTodayRESTAPI.repository.CourseRepository;

@Component
public class CourseDao {
	@Autowired
	CourseRepository crepo;

	public void save(Course course) {
		crepo.save(course);
	}

	public List<Course> getAllCourses() {
		return crepo.findAll();
	}
	
	public Optional<Course> getCourseById(int id) {
		
		
//		Optional<Course> courseById = Optional.empty();
//		
//		if(crepo.findById(id) != null) {
//			courseById = crepo.findById(id);
//		}
		return crepo.findById(id);
	}
}
