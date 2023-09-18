package com.courses.courses.Controller;

import com.courses.courses.services.userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class newController {


        @Autowired
        userservice service;

        @GetMapping("/getuser")
        public String getuser()
        {
            System.out.println("calling");
            //call service layer

           return  service.jasperReport();
        }


    }


