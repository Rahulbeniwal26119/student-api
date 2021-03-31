package org.rahul.api.controller;

import org.rahul.api.entity.Course;
import org.rahul.api.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  // no thymeleaf will work for @RestController
public class MyController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/home")
    public String home() {
        System.out.println("testing it ");
        return "index";
    }

    //get the list
    @GetMapping("/courses")
    public List<Course> getCourses() {
        return this.courseService.getCourses();
    }

    @GetMapping("/course/{id}")
    public Course getCourse(@PathVariable String id)
    {
        System.out.println("In this controller");
        System.out.println(id);
        return this.courseService.getCourse(Long.parseLong(id));
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course)
    {
        return this.courseService.addCourse(course);
    }

//    @PutMapping("/courses")
//    public Course updateCourse(@RequestBody Course)
//    {
//
//    }
}
