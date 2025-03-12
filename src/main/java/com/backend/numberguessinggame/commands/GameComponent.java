package com.backend.numberguessinggame.commands;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import java.util.Scanner;

import static java.lang.System.out;

@ShellComponent
public class GameComponent {

    int  numberOfAttempts = 0;
    int randomNumber = (int) (Math.random() * 100) + 1;
    int gameDifficulty;


    @ShellMethod(key = "start", value = "Start a new game")
    public void startGame() {
        chooseDifficulty();
        playGame();

    }

    private void chooseDifficulty() {
        out.print("Enter your choice: ");
        Scanner scanner = new Scanner(System.in);
        int difficulty = scanner.nextInt();

        switch (difficulty) {
            case 1:
                numberOfAttempts = 10;
                out.print("Great! You have selected the Easy difficulty level.\n" +
                        "Let's start the game!\n");
                break;
            case 2:
                numberOfAttempts = 5;

                out.print("Great! You have selected the Medium difficulty level.\n" +
                        "Let's start the game!\n");
                break;
            case 3:
                numberOfAttempts = 3;
                out.print("Great! You have selected the Hard difficulty level.\n" +
                        "Let's start the game!\n");
                break;

            default:
                out.print("Invalid choice. Please select a valid difficulty level.\n");
                break;
        }
    }

    private void playGame() {
        while (numberOfAttempts > 0) {

            Scanner scanner = new Scanner(System.in);
            out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            if (userGuess == randomNumber) {
                out.println("Congratulations! You have guessed the correct number in " + numberOfAttempts + " attempts.");
                break;
            } else {
                numberOfAttempts--;
                out.println("Incorrect! The number is " + (userGuess > randomNumber ? "less" : "greater") + " than " + userGuess);
                out.println("You have " + numberOfAttempts + " attempts left.");

            }
            if (numberOfAttempts == 0) {
                out.println("Game Over! The correct number was " + randomNumber);
            }
        }
    }

}
