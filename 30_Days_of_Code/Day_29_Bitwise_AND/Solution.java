import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        while (num-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();

            int max = 0;
            for (int m = 1; m < n; m++) {
                for (int i = m + 1; i <= n; i++) {
                    int result = m & i;
                    if (result < k) {
                        max = Math.max(max, result);
                    }
                    if (max == k - 1) {
                        break;
                    }
                }
            }
            System.out.println(max);
        }
    }
}
