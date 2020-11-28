package com.seleniumexpress.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("college") // If you don't specify a name, then the class name lowercase "college" will be used as the bean name
public class College {

    @Value("${college.name}")
    private String collegeName;

    @Autowired
    private Principal principal;

    @Autowired
    @Qualifier("scienceTeacher")
    private Teacher teacher;

    public College() {

    }

    public College(Principal principal) {
        System.out.println("Using constructor");
        this.principal = principal;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setPrincipal(Principal principal) {

        System.out.println("Setting principal to: " + principal);
        this.principal = principal;
    }

    public void test() {
        System.out.println("My collegeName is: " + collegeName);
        principal.principalInfo();
        teacher.teach();
        System.out.println("Testing this call method");
    }

}
