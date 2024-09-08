package session_01.package1;

import java.util.Scanner;

public class ClassB {

    public static void main(String[] args) {

        // error java -> Exception
        // Try Catch
        /*
        Interruption
        NoSuchElement
        TimeOutException
        StackOverFlow
        NoMemory
        MissMatchDataType
         */

        for(int i = 0 ; i < 3 ; i++){
            try {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Enter Number: ");
                int number = scanner.nextInt();

                if (number == 5) {
                    break;
                } else {
                    System.out.println("This is your " + (i+1) +" time out of 3");
                }


            } catch (Exception e) {
                System.out.println("Please enter correct input");
            }
        }
    }


}
