package session_01.package3;

import java.util.Scanner;

public class ClassE {

    /*
        write java program, set password
        print (Enter Your password)
        compare old password be current password
        3 attempts
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expectedResult = "Moustafa";
        System.out.println("Please, Enter your name");
        String actualResult = scanner.nextLine();
        boolean condition = expectedResult.contains(actualResult);
        System.out.println(condition);
        for (int i = 0;i < 3;i++){
        }
    }
}
