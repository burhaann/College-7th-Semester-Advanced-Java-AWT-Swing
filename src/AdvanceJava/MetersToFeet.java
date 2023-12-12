package AdvanceJava;

import java.util.*;

public class MetersToFeet {

    public static void main(String[] args) {

        String meters = null;
        double feet = 0, meter = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Distance in Meters:");

        meters = input.nextLine();
        meters.replaceAll("\\s+", "");
        try {
            meter = Double.parseDouble(meters);
            feet = meter * 3.28084;
        } catch (Exception e) {
            System.out.println(e + "\nTry Again!");
        }
        System.out.println(meter + " meters is equal to " + feet + " feet.");
    }
}
