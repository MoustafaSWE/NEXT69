package session_01.assessment;

import java.util.Scanner;

public class Assessment_02 {

    /*
    Write a Java program to ask user to enter password and user have only three attempts
    Password should be not less than 3 character

        Input Data:
        Enter Your Password:

        correct Password : op55*po*

        ***************************

        Expected Output
        Correct password

 */
    public static void main(String[] args) {


        System.out.println("Enter the password:");

        String passWord = "op55*po*";


        for (int i = 0; i < 3 ; i++) {

            Scanner inUser = new Scanner(System.in);
            String text1 = inUser.nextLine();

            if (text1.length() < 3) {
                System.out.println("Short Password, try again...");
            }
            else {
                if (text1.compareTo(passWord) == 0) {

                    System.out.println("Logged in");
                    break;

                } else {
                    System.out.println("Wrong password, Try again...");
                }
            }
        }
    }
}
