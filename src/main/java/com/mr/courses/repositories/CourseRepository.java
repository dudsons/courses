package com.mr.courses.repositories;

import com.mr.courses.models.Course;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CourseRepository extends MongoRepository<Course,String> {

    Optional<Course> findByCode(String code);


}
