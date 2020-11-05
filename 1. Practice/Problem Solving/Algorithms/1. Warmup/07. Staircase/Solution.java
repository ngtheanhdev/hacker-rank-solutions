import java.util.Scanner;

public class Solution {

    static void staircase(int n) {
        for (int i = 1; i <= n; i++){ // rows
            int j = n;
            // loop to print (size - i) spaces
            while (j-- > i) {
                System.out.print(" ");
            }
            // loop to print (i) #s
            while (j-- >= 0) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
