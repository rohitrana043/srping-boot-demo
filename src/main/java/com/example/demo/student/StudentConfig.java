package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student rohit = new Student(
                    "Rohit Rana",
                    "rohit.rana043@gmail.com",
                    LocalDate.of(1997, Month.JULY, 28)
            );
            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2000, Month.APRIL, 8)
            );
            repository.saveAll(
                    List.of(rohit, alex)
            );
        };
    }
}
