/*
    Task 2 (15 points)

    Write a Java program that uses nested for loops to print a diamond pattern of asterisks (*). The
    diamond’s maximum width is specified by the user as an odd number width. For example, if
    width = 5, the output should be:

    *
    ***
    *****
    ***
    *

    The program should prompt the user for width (assume it’s odd and positive) and print the
    diamond with proper spacing. Each row should be centered.
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the height: ");
        int height = scanner.nextInt();

        scanner.close();

        for (int i = 1; i <= (height+1)/2; i++) {

            // Giving the correct amount of spaces for each line, based on the user input. 
            // Ensures that the stars are centered and not left-aligned.
            for (int j = 1; j <= (height - (2*i-1)) / 2; j++) {
                System.out.print(" ");
            }

            // Prints the stars
            for (int k = 1; k <=2*i-1; k++) {
                System.out.print("*");
            }
            // Add a line break
            System.out.println();
        }

        for (int i = 1; i <= (height-1)/2; i--) {

            // Reversing the logic to print bottom half.
            for (int j = 1; j <= (height - (2*i-1)) / 2; j++) {
                System.out.print(" ");
            }

            // Prints the stars
            for (int k = 1; k <=2*i-1; k++) {
                System.out.print("*");
            }
            // Add a line break
            System.out.println();
        }
    }
}
