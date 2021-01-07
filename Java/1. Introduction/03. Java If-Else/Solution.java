import java.util.Scanner;

public class Solution {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int N = SCANNER.nextInt();
        SCANNER.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println(((N % 2 == 1) || (N > 5 && N < 21)) ? "Weird" : "Not Weird");

        SCANNER.close();
    }
}
