/*
    Task 5 (15 points)

    Write a Java program with a method:
    public void analyzeString(String input)
    The method should analyze the input string and print:
    ● Number of letters (uppercase or lowercase)
    ● Number of digits
    ● Number of other characters (neither letter nor digit)
    ● String length

    Example: For input = "Hello 2025!", print:
    ● The string contains 5 letters!
    ● The string contains 4 digits!
    ● The string contains 2 other characters!
    ● The string is 11 characters long!
 */

public class Task5 {
    public void analyzeString(String input) {
        int letters = 0;
        int digits = 0;
        int characters = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isLetter(c)) letters++;
            else if (Character.isDigit(c)) digits++;
            else if (Character.isSpaceChar(c)) characters++;
        }

        System.out.println("The string contains " + letters + " letters!");
        System.out.println("The string contains " + digits + " digits!");
        System.out.println("The string contains " + characters + " other characters!");
        System.out.println("The string is " + input.length() + " characters long!");
    }
}
