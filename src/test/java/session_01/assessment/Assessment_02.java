package session_01.assessment;

import java.util.Scanner;

public class Assessment_02 {

    /*
    Write a Java program to ask user to enter password and user have only three attempts
    Password should be not less than 3 character

        Input Data:
        Enter Your Password:

        ***************************

        Expected Output
        Correct password

 */
    public static void main(String[] args) {
        Scanner password=new Scanner(System.in);
        try {

        String password1=password.nextLine();
        int attempt=3;
        while (true){
            System.out.println("Enter your password");
            password1= password.nextLine();
            if (password1.length()>=3){
                System.out.println("Your password is valid");
                break;

            }

            else {
                System.out.println("Your password is invalid");
            }
        }
    } catch (Exception e) {
            System.out.println("Please correct password");
        }
    }
}
