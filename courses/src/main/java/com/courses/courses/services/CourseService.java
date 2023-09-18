package com.courses.courses.services;
import com.courses.courses.entities.Course;

import java.util.*;

public interface CourseService {

    public List<Course> getCourses();
    public Optional<Course> getCoursebyID(long courseid);


}
