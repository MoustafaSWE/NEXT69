package session_02.constructor;

import java.util.Scanner;

public class KidsList {

    public static void main(String[] args) {

        Kids kid1 = new Kids("mostafa",20,122);
        Kids kid2 = new Kids("Ali",21,123);
        Kids kid3 = new Kids("Mariam", 12 , 124);

        kid1.displayKidName();
        kid2.displayKidName();
        kid3.displayKidName();
    }
}
