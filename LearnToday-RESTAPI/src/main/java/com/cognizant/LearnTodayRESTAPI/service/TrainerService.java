package com.cognizant.LearnTodayRESTAPI.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.LearnTodayRESTAPI.model.Student;
import com.cognizant.LearnTodayRESTAPI.model.Trainer;
import com.cognizant.LearnTodayRESTAPI.repository.TrainerRepository;

@Service
public class TrainerService {
	
	@Autowired
	TrainerRepository trainRepo;
	
	public void save(Trainer trainer) {
		trainRepo.save(trainer);
	}
	
	public Trainer getTrainerByID(int id) {
		Trainer trainer=null;
		Optional<Trainer> t= trainRepo.findById(id);
		if(t.isPresent()) {
			trainer=t.get();
		}
		return trainer;
	}
	
//	public void updateTrainer(int id) {
//		Trainer trainer = 
//	}

}
