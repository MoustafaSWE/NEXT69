package session_01.assessment;

import java.util.Scanner;

public class Assessment_03 {
        /*
    Write a Java program to ask user to enter password , ask user to re-enter password,
    user have only three attempts for re-enter password.

    Password should be not less than 3 character

        Input Data:
        Enter Your Password:
        Re-enter Your Password:

        ***************************

        Expected Output
        Password Mtached

 */
        public static void main(String[] args) {
                                Scanner scanner = new Scanner(System.in);
                                String password;
                                String reenteredPassword;
                                int attempts = 3;

                                // Ask user to enter password
                                while (true) {
                                        System.out.print("Enter Your Password: ");
                                        password = scanner.nextLine();

                                        if (password.length() >= 3) {
                                                break;
                                        } else {
                                                System.out.println("Password must be at least 3 characters long. Please try again.");
                                        }
                                }
                                while (attempts > 0) {
                                        System.out.print("Re-enter Your Password: ");
                                        reenteredPassword = scanner.nextLine();

                                        if (password.equals(reenteredPassword)) {
                                                System.out.println("Password Matched");
                                                break;
                                        } else {
                                                attempts--;
                                                System.out.println("Passwords do not match. Attempts remaining: " + attempts);

                                                if (attempts == 0) {
                                                        System.out.println("You have exhausted all attempts.");
                                                }
                                        }
                                }

                        }
                }



