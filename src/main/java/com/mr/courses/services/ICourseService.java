package com.mr.courses.services;

import com.mr.courses.models.Course;

import java.util.List;

public interface ICourseService {

    Course addCourse(Course course);

    Course getCourseByCode(String code);

    List<Course> getAllCourses();

    Course putCourse(String code);

    Course patchCourse(String code);

    void deleteCourseByCode(String code);



}
