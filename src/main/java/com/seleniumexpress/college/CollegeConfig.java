package com.seleniumexpress.college;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration // Tells spring that this is a configuration class instead of using beans.xml
@ComponentScan(basePackages = "com.seleniumexpress.college") // Replaces <context:component-scan/> from beans.xml (only needed if you define a @Component)
@PropertySource("classpath:college-info.properties")
public class CollegeConfig {

    /*
    @Bean
    public Teacher mathTeacherBean() {
        return new MathTeacher();
    }

    @Bean
    public Principal principalBean() {
        return new Principal();
    }

    @Bean(name={"colBean", "collegeBean"}) // You can use multiple aliases for a bean
    public College collegeBean() { // Method name is the bean id from the beans.xml file

        // Use constructor injection
//        return new College(principalBean());

        // Use setter injection
        College college = new College();
        college.setPrincipal(principalBean());
        college.setTeacher(mathTeacherBean());
        return college;

    }

     */
}
