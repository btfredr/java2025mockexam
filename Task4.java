/*
    Task 4 (10 points)

    Write a Java program that reads a temperature in Celsius from the user and converts it to
    Fahrenheit using the formula: F = C * 9/5 + 32.

    Examples:
    ● Input = 0 → Returns 32.0
    ● Input = 100 → Returns 212.0
    The method should return the Fahrenheit value.

 */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter celcius temperature: ");
        double temp = scanner.nextDouble();
        scanner.close();

        double fahrenheit = temp*(9/5)+32;

        System.out.println(temp + " celcius equals " + fahrenheit + " fahrenheit.");
    }
}
