import java.util.Scanner;

public class Solution {

    static void miniMaxSum(int[] arr) {
        long sum = 0;
        int min = 1000000000;
        int max = 0;
        for (int i : arr) {
            if (min > i) {
                min = i;
            }
            if (max < i) {
                max = i;
            }
            sum += i;
        }
        System.out.println((sum - max) + " " + (sum - min));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
