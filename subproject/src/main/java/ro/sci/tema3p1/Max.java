package ro.sci.tema3p1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Reads three integer numbers from console and displays the biggest of them
 */
public class Max {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Input first number:");
            int noOne = keyboard.nextInt();
            System.out.println("Input second number:");
            int noTwo = keyboard.nextInt();
            int bigger = getMax(noOne, noTwo);
            System.out.println("Input third number:");
            int noThree = keyboard.nextInt();
            int biggest = getMax(bigger, noThree);
            System.out.println("The biggest number is: " + biggest);
        } catch (InputMismatchException e) {
            System.out.println("This is not an integer number");
        }
    }

    /**
     * Returns the biggest of two integer numbers
     */
    public static int getMax(int a, int b) {
        int max = a;
        if (b > a) {
            max = b;
        }
        return max;
    }
}
