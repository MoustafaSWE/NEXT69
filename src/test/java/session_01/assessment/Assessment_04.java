package session_01.assessment;

import java.util.Scanner;

public class Assessment_04 {

    /*
     Write a Java method to find the smallest number among three numbers.
        Test Data:
        Input the first number: 25
        Input the Second number: 37
        Input the third number: 29

        ***************************

        Expected Output:

        The smallest value is 25.0
     */
    public static void main(String[] args) {
        Scanner Number = new Scanner(System.in);
        try {

        System.out.println("Enter the first number : ");
        double num1 = Number.nextInt();
        System.out.println("Enter the second number : ");
        double num2 = Number.nextInt();
        System.out.println("Enter the third number : ");
        double num3 = Number.nextInt();
        if (num1 < num2 && num1 < num3){
            System.out.println("The Smallest number is " + num1);
        } else if (num2 < num1 && num2 < num3){
            System.out.println("The Largest number is " + num2);
        } else if (num3 < num1 && num3 < num2){
            System.out.println("The Smallest number is " + num3);
        }
        } catch (Exception e) {
            System.out.println("Please Try Again");
        }
    }
}
