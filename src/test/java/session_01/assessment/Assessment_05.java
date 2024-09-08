package session_01.assessment;

import java.util.Scanner;

public class Assessment_05 {

    /*
        Write java program to ask user to enter mobile number,

        input:
        Please, Enter your mobile number?

        output:
        your mobile number is 010******
        and your sim-card is vodafone
     */
    public static void main(String[] args) {
        while (true) {
            try {
                // we asked user to enter mobile number
                System.out.println("Please, Enter your mobile number?");
                // create object from Scanner Class
                Scanner scanner = new Scanner(System.in);
                // Store text, variable enterText
                String enterText = scanner.nextLine();  // "01052636"
                int number = Integer.parseInt(enterText);

                System.out.println("Your mobile Number is: 0" + number);

                String firstThreeNumbers = enterText.substring(0,3);

                switch (firstThreeNumbers){
                    case "010":
                        System.out.println("Your sim-card is vodafone");
                        break;
                    case "011":
                        System.out.println("Your sim-card is etisalat");
                        break;
                    case "012":
                        System.out.println("Your sim-card is orange");
                        break;
                    default:
                        System.out.println("You entered Wrong mobile Number");
                        break;
                }
                break;
            } catch (Exception e) {
                System.out.println("Please, Enter valid mobile number");
            }
        }
    }
}
