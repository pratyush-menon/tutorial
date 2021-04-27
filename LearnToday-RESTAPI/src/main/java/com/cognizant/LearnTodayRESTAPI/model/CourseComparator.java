package com.cognizant.LearnTodayRESTAPI.model;

import java.util.Comparator;

public class CourseComparator implements Comparator<Course>{

	@Override
	public int compare(Course c1, Course c2) {
		
		return c1.getStart_Date().compareTo(c2.getStart_Date());
	}

}