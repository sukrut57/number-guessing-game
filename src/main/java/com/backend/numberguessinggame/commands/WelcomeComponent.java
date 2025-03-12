package com.backend.numberguessinggame.commands;

import org.springframework.boot.Banner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.io.PrintStream;
import static java.lang.System.out;

@Component
public class WelcomeComponent implements Banner {


    @Override
    public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
        printWelcomeMessage();
    }

    private void printWelcomeMessage() {
        out.println("Welcome to Number Guessing Game!");
        out.println("I'm thinking of a number between 1 and 100");
        out.println("You have 5 chances to guess the correct number"+ "\n");
        out.println("Please select your difficulty level:");
        out.println("1. Easy (10 chances)");
        out.println("2. Medium (5 chances)");
        out.println("3. Hard (3 chances)\n");

        out.println("Enter 'start' to begin the game");


    }

}
