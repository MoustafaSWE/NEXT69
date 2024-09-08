package session_01.assessment;

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

        String numberAsText = "010000";
        String firstThreeInt = numberAsText.substring(0,3);

        int numberFromText = Integer.parseInt(numberAsText);

        System.out.println("0"+numberFromText);
        System.out.println(firstThreeInt);
    }
}
