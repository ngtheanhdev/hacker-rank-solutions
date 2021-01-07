import java.util.Scanner;

public class Solution {

    static void plusMinus(int[] arr) {
        int countPositiveNum = 0;
        int countNegativeNum = 0;
        int countZeroNum = 0;
        for (int i : arr) {
            if (i > 0) {
                countPositiveNum++;
            } else if (i < 0) {
                countNegativeNum++;
            } else {
                countZeroNum++;
            }
        }
        int length = arr.length;
        System.out.println((float) countPositiveNum / length);
        System.out.println((float) countNegativeNum / length);
        System.out.println((float) countZeroNum / length);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
