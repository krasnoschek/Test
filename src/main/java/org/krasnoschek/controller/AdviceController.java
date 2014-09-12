package org.krasnoschek.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Locale;

@ControllerAdvice
public class AdviceController {


    @ExceptionHandler
    public void onThrow(Exception e, Locale locale){

        int i=0;
        i++;
    }

}
