package com.mr.courses.services;

import com.mr.courses.exceptions.CourseErrorEnum;
import com.mr.courses.exceptions.CourseException;
import com.mr.courses.models.Course;
import com.mr.courses.repositories.CourseRepository;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

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
        return courseRepository.findByCode(code).orElseThrow(() -> new CourseException(CourseErrorEnum.COURSE_NOT_FOUND));
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course putCourse(String code) {
        Course course = courseRepository.findByCode(code).orElseThrow(() -> new CourseException(CourseErrorEnum.COURSE_NOT_FOUND));
        return courseRepository.save(course);
    }

    @Override
    public Course patchCourse(String code) {
        Course course = courseRepository.findByCode(code).orElseThrow(() -> new CourseException(CourseErrorEnum.COURSE_NOT_FOUND));

        if (StringUtils.hasText(course.getName())) {
            course.setCode(course.getName());
        }
        if (StringUtils.hasText(course.getDescription())) {
            course.setDescription(course.getDescription());
        }
        if (!ObjectUtils.isEmpty(course.getStartDate())) {
            course.setStartDate(course.getStartDate());
        }
        if (!ObjectUtils.isEmpty(course.getEndDate())) {
            course.setEndDate(course.getEndDate());
        }
        if (!ObjectUtils.isEmpty(course.getParticipantsLimit())) {
            course.setParticipantsLimit(course.getParticipantsLimit());
        }
        if (!ObjectUtils.isEmpty(course.getParticipantsNumber())) {
            course.setParticipantsNumber(course.getParticipantsNumber());
        }

        return course;
    }

    @Override
    public void deleteCourseByCode(String code) {
        boolean courseExist = courseRepository.existsByCode(code);
        if (courseExist) {
            courseRepository.deleteById(code);
        } else {
            throw new CourseException(CourseErrorEnum.CODE_NOT_FOUND);
        }
    }
}
