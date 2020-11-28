package com.seleniumexpress.college;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // Makes this the primary implementation of teacher
public class MathTeacher implements Teacher {

    @Override
    public void teach() {
        System.out.println("Hi I am your math teacher");
    }
}
