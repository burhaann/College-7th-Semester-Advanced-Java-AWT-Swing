package AdvanceJava;

import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[] args) {

        String pounds = null, inches = null;
        double kg = 0, meter = 0, bmi = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Weight in Pounds:");

        pounds = input.nextLine();
        pounds.replaceAll("\\s+", "");
        try {
            kg = Double.parseDouble(pounds);
            kg = kg * .45359237;
        } catch (Exception e) {
            System.out.println(e + "\nTry Again!");
        }

        System.out.println("Enter height in inches:");
        inches = input.next();
        inches.replaceAll("\\s+", "");
        try {
            meter = Double.parseDouble(inches);
            meter = meter * .0254;
        } catch (Exception e) {
            System.out.println(e + "\n×Try Again×");
        }
        bmi = kg / (meter * meter);
        System.out.println(
                "BODY MASS INDEX of a person with a\nbody weight of "
                        + kg
                        + " kilograms\nand weight of "
                        + meter
                        + " meters is:");
        System.out.println(bmi + " kg/m².");
    }
}
