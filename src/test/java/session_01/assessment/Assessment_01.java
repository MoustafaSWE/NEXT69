package session_01.assessment;

import java.util.Scanner;

public class Assessment_01 {

    /*
    Write a Java program to compare two numbers.
        Input Data:
        Input first integer: 25
        Input second integer: 39

        ***************************

        Expected Output

     */

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        try {


            System.out.println("Enter the first number: ");
            int num1 = number.nextInt();
            System.out.println("Enter the second number: ");
            int num2 = number.nextInt();
            System.out.println(num1);
            System.out.println(num2);
        } catch (Exception e) {
            System.out.println("Please enter a valid number");
        }
    }
}
