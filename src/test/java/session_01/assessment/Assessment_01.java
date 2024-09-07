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


       try {
           System.out.println("Enter two numbers pls :");

           Scanner typed1 = new Scanner(System.in);
           int text1 = Integer.parseInt(typed1.nextLine());

           Scanner typed2 = new Scanner(System.in);
           int text2 = Integer.parseInt(typed2.nextLine());

           System.out.println(text1);
           System.out.println(text2);

       } catch (Exception e) {

           System.out.println("Please insert numbers only...");

           System.out.println("Enter two numbers pls :");

           Scanner typed1 = new Scanner(System.in);
           int text1 = Integer.parseInt(typed1.nextLine());

           Scanner typed2 = new Scanner(System.in);
           int text2 = Integer.parseInt(typed2.nextLine());

           System.out.println(text1);
           System.out.println(text2);
       }

    }
}