package com.mr.courses.exceptions;

public enum CourseErrorEnum {

    COURSE_NOT_FOUND("course in not found");

    private String message;

    CourseErrorEnum(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
