package com.courses.courses.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.courses.courses.entities.Course;
import java.util.List;

import com.courses.courses.courseDAO.coursedao;

import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

@Autowired
    private coursedao dao;
   // List<Course> list = new ArrayList<>();
    @Override
    public List<Course> getCourses(){

   //     List<Course> list = new ArrayList<>();
//     list.add(new Course(145,"Java Core COurse","This is very good java core course") );
//      list.add(new Course(155,"springboot Core COurse","This is very good springboot course") );
     return dao.findAll();
    }
    @Override
    public Optional<Course> getCoursebyID(long courseid)
    {
     //   list.add(new Course(145,"Java Core COurse","This is very good java core course") );
       // list.add(new Course(155,"springboot Core COurse","This is very good springboot course") );
//        Course c = null;
//
//        for( Course traverse:list)
//
//        {
//            if(traverse.getId() == courseid)
//            {
//                c = traverse;
//                        break;
//            }

//        }
        return dao.findById(courseid);
    }



}
