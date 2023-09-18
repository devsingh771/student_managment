package com.courses.courses.courseDAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.courses.courses.entities.Course;

@Repository
public interface coursedao extends JpaRepository<Course,Long> {

}

