package session_02.assessment;

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

        Scanner inUser = new Scanner(System.in);
        int age;

        while (true) {

            try {

                System.out.println("Enter your age....");
                age = Integer.parseInt(inUser.nextLine());

                if (age <= 0) {

                    System.out.println("Use positive numbers dude...");

                } else if ((age > 0) && (age <= 12)) {

                    System.out.println("you are A cry baby");
                    break;

                } else if ((age > 12) && (age <= 19)) {

                    System.out.println("you are teen");
                    break;

                } else if ((age > 19) && (age <= 64)) {

                    System.out.println("you are adult");
                    break;

                } else if (age > 64) {

                    System.out.println(" you are a fossil");
                    break;

                }
            }
            catch (Exception e) {

                System.out.println("pls enter integer values");

            }
        }
    }
}