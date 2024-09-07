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

        Scanner smallNum = new Scanner(System.in);
        int[] arr = {0,0,0};
        int smallest;

        System.out.println("Enter the first number..");
        arr[0] = Integer.parseInt(smallNum.nextLine());

        System.out.println("Enter the second number..");
        arr[1] = Integer.parseInt(smallNum.nextLine());

        System.out.println("Enter the third number..");
        arr[2] = Integer.parseInt(smallNum.nextLine());

        smallest = arr[0];

        for (int i = 1; i < 3; i++) {

            if (smallest > arr[i]) {

                smallest = arr[i];
            }
        }
        System.out.println("The smallest value is :" + smallest);
    }
}
