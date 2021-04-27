
package com.cognizant.LearnTodayRESTAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
import com.cognizant.LearnTodayRESTAPI.model.Trainer;
import com.cognizant.LearnTodayRESTAPI.service.CourseService;
import com.cognizant.LearnTodayRESTAPI.service.StudentService;
import com.cognizant.LearnTodayRESTAPI.service.TrainerService;

@RestController 	
public class TrainerController {

	@Autowired
	CourseService courseService;
	
	@Autowired
	StudentService studentService;
	
	@Autowired
	TrainerService trainerService;
	
	
	
	@PostMapping("/api/Trainer")
	public ResponseEntity<Object> trainerSignUp(@RequestBody Trainer trainer){
		try{
			trainerService.save(trainer);
			return new ResponseEntity(HttpStatus.CREATED);
		}catch(Exception e) {
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
	}
	
	@PutMapping("/api/Trainer/{id}")
	public ResponseEntity<Object> updatePassword(@PathVariable int id, @RequestBody Trainer t){
		Trainer trainer = trainerService.getTrainerByID(id);
		
		if(trainer==null) {
			return new ResponseEntity("Searched Data not Found",HttpStatus.NOT_FOUND);
		}else {
			trainer.setPassword(t.getPassword());
			trainerService.save(trainer);
			return new ResponseEntity("Data updated successfully",HttpStatus.OK);
		}
		
	}

	
}
