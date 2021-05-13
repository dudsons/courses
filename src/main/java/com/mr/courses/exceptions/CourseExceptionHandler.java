package com.mr.courses.exceptions;


import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CourseExceptionHandler {


    @ExceptionHandler
    public ErrorMessage getErrorMessage (CourseException courseException){
        if(CourseErrorEnum.COURSE_NOT_FOUND.equals(courseException.getExceptionMessage())){
            return new ErrorMessage(CourseErrorEnum.COURSE_NOT_FOUND.getMessage());
        } else if (CourseErrorEnum.CODE_NOT_FOUND .equals(courseException.getExceptionMessage())){
            return new ErrorMessage(CourseErrorEnum.CODE_NOT_FOUND.getMessage());
        }

       return new ErrorMessage("Unknow exception");
    }

}
