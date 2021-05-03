package com.mr.courses.services;

import com.mr.courses.exceptions.CourseErrorEnum;
import com.mr.courses.exceptions.CourseException;
import com.mr.courses.models.Course;
import com.mr.courses.repositories.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements ICourseService {

    private final CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course getCourseByCode(String code) {
         return courseRepository.findByCode(code).orElseThrow(()->new CourseException(CourseErrorEnum.COURSE_NOT_FOUND));
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course putCourse(String code) {
        return null;
    }

    @Override
    public Course patchCourse(String code) {
        return null;
    }

    @Override
    public Course deleteCourseByCode(String code) {
        return null;
    }
}
