import java.util.Arrays;
import java.util.Scanner;

class Difference {
    private final int[] elements;
    int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference() {
        int max = Arrays.stream(this.elements).max().orElse(0);
        int min = Arrays.stream(this.elements).min().orElse(0);
        this.maximumDifference = max - min;
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
