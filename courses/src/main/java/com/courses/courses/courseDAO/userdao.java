package com.courses.courses.courseDAO;
import com.courses.courses.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface userdao extends JpaRepository<User,Long> {

    }

