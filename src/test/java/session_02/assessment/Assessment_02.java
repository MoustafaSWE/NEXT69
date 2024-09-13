package session_02.assessment;

import java.util.Scanner;

public class Assessment_02 {

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
    public static void main(String[] args) {

        while (true) {

            try {

                Scanner inUser = new Scanner(System.in);
                double firstNum;
                double secondNum;
                double sum;
                String operand;

                System.out.println("Enter the first num....");
                firstNum = Double.parseDouble(inUser.nextLine());

                System.out.println("Enter the math operand....");
                operand = inUser.nextLine();

                System.out.println("Enter the second num....");
                secondNum = Double.parseDouble(inUser.nextLine());

               /* if (("+" == operand) || ("-" == operand) || ("*" == operand) || ("/" == operand)) {*/

                    switch (operand) {

                        case "+":

                            sum = firstNum + secondNum;
                            System.out.println(sum);
                            break;

                        case "-":

                            sum = firstNum - secondNum;
                            System.out.println(sum);
                            break;

                        case "*":

                            sum = firstNum * secondNum;
                            System.out.println(sum);
                            break;

                        case "/":

                            if (secondNum == 0) {

                                System.out.println("u can not divide buy zero");
                                break;

                            } else {

                                sum = firstNum / secondNum;
                                System.out.println(sum);
                                break;
                            }
                        default:
                            System.out.println("retype the operand pls");
                    }
                //}
               /* else {

                    System.out.println("retype the operand pls");
                }*/
            }
            catch(Exception e){

                System.out.println("lock in and type again");
        }
    }
    }
}

