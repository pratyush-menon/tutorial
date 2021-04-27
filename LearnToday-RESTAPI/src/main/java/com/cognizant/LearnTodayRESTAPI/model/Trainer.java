package com.cognizant.LearnTodayRESTAPI.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trainer {
	@Id
	private int TrainerId;
	private String password;

	public Trainer() {
		super();
	}

	public Trainer(int trainerId, String password) {
		super();
		TrainerId = trainerId;
		this.password = password;
	}

	public int getTrainerId() {
		return TrainerId;
	}

	public void setTrainerId(int trainerId) {
		TrainerId = trainerId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Trainer [TrainerId=" + TrainerId + ", password=" + password + "]";
	}

}
