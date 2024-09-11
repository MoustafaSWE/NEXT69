package session_02.assessment;
import java.util.InputMismatchException;
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
        try (Scanner scanner = new Scanner(System.in)) {
            //  input two numbers
            System.out.println("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.println("Enter the second number: ");
            double num2 = scanner.nextDouble();

            // select  operation
            System.out.println("Select an operation (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            // Perform the calculation
            try {
                double result ;
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                        break;
                    case '-':
                        result = num1 - num2;
                        System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                        break;
                    case '*':
                        result = num1 * num2;
                        System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                        break;
                    case '/':
                        // Handle division by zero
                        if (num2 == 0) {
                            System.out.println("Division by zero is not allowed!!");
                        }else {
                        result = num1 / num2;
                        System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                        }
                        break;
                    default:
                        //  invalid operators
                        System.out.println("Error: Invalid operator!. Please use +, -, *, or /.");
                }
            } catch (ArithmeticException e) {
                // Handle division by zero
                System.out.println("Error: " + e.getMessage());
            }

        } catch (InputMismatchException e) {
            // Handle invalid input for numbers
            System.out.println("Error: Please enter valid numbers.");
        }
    }
}
