package com.springweek1.springweek1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Springweek1Application {

    public static void main(String[] args) {
        SpringApplication.run(Springweek1Application.class, args);
    }

}
