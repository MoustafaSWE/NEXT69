package session_02.assessment;
import java.util.InputMismatchException;

import java.util.Scanner;

public class Assessment_01 {

    /*

    Write a Java program that prompts the user to enter their age, and based on the input, classify the user into one of the following categories:

        Child: 0 to 12 years
        Teenager: 13 to 19 years
        Adult: 20 to 64 years
        Senior: 65 years and older
        Use an if-else structure to classify the user's age, and handle the case where the input is negative (invalid age).

    Requirements:

        The program should print an error message if the age entered is negative.
        Use exception handling to manage non-integer inputs.

     */

    public static void main(String[] args) {
            // Try-with-resources to automatically close the scanner
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter your age: ");

            // Handle invalid integer input using InputMismatchException
            try {
                int userAge = scanner.nextInt();

                // Handle age classification with proper cases
                if (userAge < 0) {
                    System.out.println("Invalid Age Input.");
                } else if (userAge <= 12) {
                    System.out.println("You are a Child.");
                } else if (userAge <= 19) {
                    System.out.println("You are a Teenager.");
                } else if (userAge <= 64) {
                    System.out.println("You are an Adult.");
                } else {
                    System.out.println("This is the last level: Hello Senior.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input: Please enter a valid number for age.");
            }
        }
    }
}
