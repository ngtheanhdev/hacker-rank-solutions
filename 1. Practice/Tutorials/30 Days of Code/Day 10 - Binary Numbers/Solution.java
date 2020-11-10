import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        char[] binary = Integer.toBinaryString(n).toCharArray();

        int tmpCount = 0;
        int maxCount = 0;
        for (char c : binary) {
            if (c == '0') {
                if (tmpCount > maxCount) {
                    maxCount = tmpCount;
                }
                tmpCount = 0;
            } else {
                tmpCount = tmpCount + 1;
            }
        }
        System.out.println(Math.max(tmpCount, maxCount));
        scanner.close();
    }
}
