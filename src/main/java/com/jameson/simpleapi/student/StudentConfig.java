package com.jameson.simpleapi.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
CommandLineRunner commandLineRunner(StudentRepository repository){
    return args -> {
Student mariam=new Student(
        "Mariam",
        "mariam@gmail.com",
        LocalDate.of(2000, FEBRUARY,5)

);
        Student jameson=new Student(
                "Jameson",
                "jameson@gmail.com",
                LocalDate.of(1999, APRIL,6)

        );
        repository.saveAll(
                List.of(mariam,jameson)
        );

    };
}
}
