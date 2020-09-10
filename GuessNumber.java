//this program will run indefinitely 

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        // generate a random number between 1 & 100
        int number = (int) (Math.random() * 100);
        System.out.println("Guess a number between 1 and 100");
        Scanner input = new Scanner(System.in);

        // loop
        int guess = -1;
        while (guess != number) {
            System.out.println("Enter your guess");
            guess = input.nextInt();
            if (guess == number) {
                System.out.println("That is correct");
            } else if (guess > number) {
                System.out.println("Your guess is too big.");
            } else {
                System.out.println("Your guess is too small.");
            }
        }

    }
}