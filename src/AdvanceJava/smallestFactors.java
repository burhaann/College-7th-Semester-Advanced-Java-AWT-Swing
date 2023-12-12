package AdvanceJava;

import java.util.*;

public class smallestFactors {

    public static void main(String[] args) {

        int i = 0, j = 2;
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter a Number: ");
            i = input.nextInt();
            if (i == 1) {
                System.out.print(i);
            }
            while (i > 1) {
                if (i % j == 0) {
                    if (i == j) {
                        System.out.print(j + ".");
                    } else {
                        System.out.print(j + ", ");
                    }
                    i /= j;
                } else {
                    j++;
                }
            }

        } catch (Exception e) {
            System.out.println(e + " \nPlease Provide Correct Inputs: \n");
            main(null);
        }
        System.out.println("\nYou may try again ");
        main(null);
    }
}

