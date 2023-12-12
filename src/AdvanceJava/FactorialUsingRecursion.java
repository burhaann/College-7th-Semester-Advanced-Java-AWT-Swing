package AdvanceJava;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialUsingRecursion {
    static long number = 0, factorial = 0;
    static Scanner input = new Scanner(System.in);
    // static boolean validInput = true;

    public static void main(String[] args) {

        userInput();

        try {
            factorial = Factorial(number);
            System.out.println("Result of " + number + "!: " + factorial);
            System.out.println("Using Recursion: " + factorialUsingRecursion(number));
        } catch (StackOverflowError err) {
            System.out.println("Too Big Of a Number to Handle.\n" + err);
        }
    }

    public static void userInput() {
        while (true) {
            try {
                input = new Scanner(System.in);
                System.out.print("Enter a Number: ");
                number = input.nextLong();
                break;
            } catch (Exception e) {
                System.out.print(e + "\nInput not a Valid Number! \n\nPlease ");
            }
        }
    }

    public static long Factorial(long number) {
        BigInteger fact = BigInteger.valueOf(1);
        for (int i = 1; i <= number; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Factorial using Java.Math for Bigger Numbers :\n" + fact);

        long facto = 1;
        if (number == 1 || number == 0) {
            return 1;
        } else if (number < 21 && number > 1) {
            for (long i = number; i > 0; i--) {
                facto *= i;
            }
        } else {
            System.out.println("\nFactorials for numbers greater than\n20 will generate an overflow when \nusing long or int data types.\n");
            facto = 0;
        }
        return facto;
    }
//  }

    public static long factorialUsingRecursion(long number) {
        long factorial = 1;
        if (number == 0 || number == 1) {
            return factorial;
        } else if (number < 21 && number > 1) {
            return (number * factorialUsingRecursion(number - 1));
        } else {
            return 0;
        }
    }
}
