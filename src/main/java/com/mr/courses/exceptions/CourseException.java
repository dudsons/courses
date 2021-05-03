package com.mr.courses.exceptions;

public class CourseException extends RuntimeException {

    private CourseErrorEnum exceptionMessage;

    public CourseException(CourseErrorEnum courseErrorEnum){
        this.exceptionMessage = courseErrorEnum;
    }

    public CourseErrorEnum getExceptionMessage() {
        return exceptionMessage;
    }
}
