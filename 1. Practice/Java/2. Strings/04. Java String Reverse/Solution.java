import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        int halfLength = a.length() / 2;
        int lastIndex = a.length() - 1;

        boolean isPalindrome = true;
        for (int i = 0; i < halfLength / 2; i++) {
            if (a.charAt(i) != a.charAt(lastIndex - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome ? "Yes" : "No");
    }
}
