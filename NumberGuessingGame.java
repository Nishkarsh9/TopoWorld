package TopoWorld;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random Random_number = new Random();
        int answer = Random_number.nextInt(100);
        int turns = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Guess Number Game.");
        System.out.println("Guess a number between 1 to 100, You will have 10 turns!");

        int guess;
        int i = 0;
        boolean win = false;
        while (win == false) {
            guess = sc.nextInt();
            turns++;

            if (guess == answer) {
                win = true;
            } else if (i > 3) {
                System.out.println("You loose! the right answer was: " + answer);
                return;
            } else if (guess < answer) {
                i++;
                System.out.println("your guess number is to smaller: ");

            } else if (guess > answer) {
                i++;
                System.out.println("your guess number is to greater:");

            }

        }
        System.out.println("congrulations You are win!");
        System.out.println("The number was " + answer);
        System.out.println("You used " + turns + " turns to guess the right number");
        System.out.println("Your score is " + ((11 - turns) * 10) + " out of 100");

    }
}
