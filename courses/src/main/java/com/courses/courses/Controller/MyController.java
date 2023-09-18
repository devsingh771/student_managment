package com.courses.courses.Controller;
import com.courses.courses.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.courses.courses.entities.Course;

import java.util.List;
import java.util.Optional;

@RestController
public class MyController {
  // @Autowired
  // public CourseService courseservice;
    @Autowired
  CourseService courseService;
    //CourseServiceImpl courseServiceImpl;
    @GetMapping("/allcourses")
    public List<Course> getCourses()
    {
        System.out.println("calling");
       //call service layer

        return courseService.getCourses();
    }
    @GetMapping("/courses/{courseid}")
    public Optional<Course> getCoursebyID(@PathVariable long courseid)
    {
       return courseService.getCoursebyID(courseid);
        //Long.parseLong(courseid)
    }


}
