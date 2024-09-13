//package session_02.assessment;

//import java.util.Scanner;

//public class Assessment_02 {

import java.util.Scanner;

/*

    Write a simple calculator program that:

        Asks the user to input two numbers.
        Asks the user to select an operation (+, -, *, /).
        Based on the selected operation, perform the calculation and print the result.
        Use a switch statement to handle the operation selection, and include a try-catch block to handle division by zero errors.

    Requirements:

        Use a switch statement to decide which operation to perform.
        The program should handle invalid operators by displaying an error message.
        Catch and handle any arithmetic exceptions (like division by zero).

 */


    public class Assessment_02 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Set initial password
            System.out.print("Set your password: ");
            String oldPassword = scanner.nextLine();

            // Allow 3 attempts to enter the correct password
            int attempts = 3;
            boolean passwordMatch = false;

            while (attempts > 0) {
                System.out.print("Enter your password: ");
                String currentPassword = scanner.nextLine();

                if (currentPassword.equals(oldPassword)) {
                    passwordMatch = true;
                    break;
                } else {
                    attempts--;
                    System.out.println("Incorrect password. You have " + attempts + " attempt(s) left.");
                }
            }

            if (passwordMatch) {
                System.out.println("Password matched successfully.");
            } else {
                System.out.println("Failed to enter the correct password in 3 attempts.");
            }

            scanner.close();
        }
    }