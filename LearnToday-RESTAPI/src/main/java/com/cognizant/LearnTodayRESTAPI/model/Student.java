package com.cognizant.LearnTodayRESTAPI.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int EnrollmentId;
	private int StudentId;
	private int CourseId;

	public Student() {
		super();
	}

	public Student(int enrollmentId, int studentId, int courseId) {
		super();
		EnrollmentId = enrollmentId;
		StudentId = studentId;
		CourseId = courseId;
	}

	public int getEnrollmentId() {
		return EnrollmentId;
	}

	public void setEnrollmentId(int enrollmentId) {
		EnrollmentId = enrollmentId;
	}

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

	public int getCourseId() {
		return CourseId;
	}

	public void setCourseId(int courseId) {
		CourseId = courseId;
	}

	@Override
	public String toString() {
		return "Student [EnrollmentId=" + EnrollmentId + ", StudentId=" + StudentId + ", CourseId=" + CourseId + "]";
	}

}
