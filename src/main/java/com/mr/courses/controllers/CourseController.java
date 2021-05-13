package com.mr.courses.controllers;

import com.mr.courses.models.Course;
import com.mr.courses.services.ICourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private final ICourseService courseService;

    public CourseController(ICourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping
    public Course addCourse (@RequestBody Course course){
        return courseService.addCourse(course);
    }

    @GetMapping("/{code}")
    Course getCourseByCode(@PathVariable String code){
        return courseService.getCourseByCode(code);
    }

    @GetMapping
    public List<Course> getAllCourses (){
        return courseService.getAllCourses();
    }

    @DeleteMapping("/{code}")
    public void deleteCourseByCode (@PathVariable String code){
         courseService.deleteCourseByCode(code);
    }
}
