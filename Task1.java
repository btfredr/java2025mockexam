/*
    Task 1 (10 points)

    Write a method that takes a double value as an argument and returns the smallest integer
    number greater than or equal to the input that is divisible by 3.
    Examples:
    ● Input = 10.7 → Returns 12
    ● Input = 9.0 → Returns 9
    ● Input = -4.2 → Returns -3

 */


public class Task1 {
    
    public int greaterThanOrEqual (double n) {
        int floor = (int) Math.floor(n);

        if (floor % 3 == 0) {
            int result = floor - 3;
            return result;
        } else {
            return (int) floor;
        }
    }
}