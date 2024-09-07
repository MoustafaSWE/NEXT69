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
        Password Matched

 */
        public static void main(String[] args) {

                Scanner inUser = new Scanner(System.in);
                String passWord;
                String rePassword;
                int i = 3;

                System.out.println("Enter the password:");

                while (true) {

                    passWord = inUser.nextLine();

                    if (passWord.length()<3) {

                        System.out.println("Short Password, try again...");

                    } else {

                       break;
                    }
                }

                while(i > 0) {

                    System.out.println("Re-enter Password...");
                    rePassword = inUser.nextLine();

                        if (passWord.equals(rePassword)) {

                                System.out.println("Password matched");
                                break;

                        } else {

                                System.out.println("Wrong password, Try again...");
                                i--;
                        }
                }
        }
}

