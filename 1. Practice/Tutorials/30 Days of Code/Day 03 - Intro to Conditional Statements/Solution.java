import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println((n % 2 == 1 || (6 <= n && n <= 20)) ? "Weird" : "Not Weird");

        scanner.close();
    }
}
