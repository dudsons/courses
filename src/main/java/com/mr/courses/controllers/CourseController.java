package com.mr.courses.controllers;

import com.mr.courses.models.Course;
import com.mr.courses.services.ICourseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private final ICourseService courseService;

    public CourseController(ICourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public Course addCourse (@RequestBody Course course){
        return courseService.addCourse(course);
    }

    @GetMapping("/test")
    public void test (){
        System.out.println("I am in");
    }
}
