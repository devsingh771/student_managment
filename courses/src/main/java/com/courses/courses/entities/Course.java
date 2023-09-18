package com.courses.courses.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
 private long id;
 private String title;
 private String description;

    public Course(long id, String title, String description) {
       // super();
        this.id = id;
        this.title = title;
        this.description = description;
    }
    public Course() {
    }

//    public Course()
//    {
//        //default constructor
//        super();
//    }//constructor


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}


