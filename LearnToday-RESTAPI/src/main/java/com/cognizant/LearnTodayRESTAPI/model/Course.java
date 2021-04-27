package com.cognizant.LearnTodayRESTAPI.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	@Id
	private int CourseId;
	private String Title;
	private float Fees;
	private String Description;
	private String Trainer;
	private Date Start_Date;
	//private List<Student> Students;

	public Course() {
		super();
	}

	public Course(int courseId, String title, float fees, String description, String trainer, Date start_Date) {
		super();
		CourseId = courseId;
		Title = title;
		Fees = fees;
		Description = description;
		Trainer = trainer;
		Start_Date = start_Date;
		//Students = students;
	}

	public int getCourseId() {
		return CourseId;
	}

	public void setCourseId(int courseId) {
		CourseId = courseId;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public float getFees() {
		return Fees;
	}

	public void setFees(float fees) {
		Fees = fees;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getTrainer() {
		return Trainer;
	}

	public void setTrainer(String trainer) {
		Trainer = trainer;
	}

	public Date getStart_Date() {
		return Start_Date;
	}

	public void setStart_Date(Date start_Date) {
		Start_Date = start_Date;
	}

	@Override
	public String toString() {
		return "Course [CourseId=" + CourseId + ", Title=" + Title + ", Fees=" + Fees + ", Description=" + Description
				+ ", Trainer=" + Trainer + ", Start_Date=" + Start_Date + "]";
	}

}
