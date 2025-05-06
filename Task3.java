/*
    Task 3 (15 points)

    Write a method that takes an integer n as an argument. If n is even, use a while loop to print
    numbers from n down to n - 4 in descending order. If n is odd, print the cube of n (i.e., n * n * n).
    Examples:
    ● n = 8 → Prints: 8,7,6,5,
 */


public class Task3 {
    
    public void evenOrCube(int n) {

        int count = n;
        int min = n - 4;
        if (n % 2 == 0) {
            while (count >= min) {
                if (count > min) {
                    System.out.print(count + ", ");
                    count--;
                } else {
                    System.out.print(count);
                }
                System.out.println();
            } 
        } else {
            System.out.println("Cube of n: ");
            System.out.print((n*n)*2);
        }
    }
}
