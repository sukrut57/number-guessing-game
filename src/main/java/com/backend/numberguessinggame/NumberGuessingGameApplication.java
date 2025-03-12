package com.backend.numberguessinggame;

import com.backend.numberguessinggame.commands.WelcomeComponent;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NumberGuessingGameApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(NumberGuessingGameApplication.class);
        app.setBanner(new WelcomeComponent());
        app.run(args);
    }


}
