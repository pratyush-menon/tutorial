package com.cognizant.LearnTodayRESTAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.LearnTodayRESTAPI.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

}
