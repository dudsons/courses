package com.mr.courses.exceptions;

public enum CourseErrorEnum {

    COURSE_NOT_FOUND("course in not found"),
    CODE_NOT_FOUND("course with that code is not found");

    private String message;

    CourseErrorEnum(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
