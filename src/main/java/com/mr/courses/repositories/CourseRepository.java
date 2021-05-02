package com.mr.courses.repositories;

import com.mr.courses.models.Course;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends MongoRepository<Course,String> {

    Course findByCode(String code);


}
