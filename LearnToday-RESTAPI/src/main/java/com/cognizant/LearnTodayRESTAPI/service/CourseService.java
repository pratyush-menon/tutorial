package com.cognizant.LearnTodayRESTAPI.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.LearnTodayRESTAPI.Dao.CourseDao;
import com.cognizant.LearnTodayRESTAPI.model.Course;
import com.cognizant.LearnTodayRESTAPI.repository.CourseRepository;

@Service
public class CourseService {
	@Autowired
	CourseDao cdao;
	
	@Autowired
	CourseRepository courseRepo;

	public void save(Course course) {
		courseRepo.save(course);
	}

//	public List<Course> getAllCourses() {
//		return cdao.getAllCourses();
//	}
//	
//	public Optional<Course> getCourseById(int id){
//		return cdao.getCourseById(id);
//	}
	
	public List<Course> getAllCourses(){
		return courseRepo.findAll();
	}
	
	public Course getCourseByID(int id) {
		Course course=null;
		Optional<Course> p= courseRepo.findById(id);
		if(p.isPresent()) {
			course=p.get();
		}
		return course;
	}
}
