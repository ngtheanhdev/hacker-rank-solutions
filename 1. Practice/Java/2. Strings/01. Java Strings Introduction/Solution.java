import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        a = a.substring(0, 1).toUpperCase() + a.substring(1);
        b = b.substring(0, 1).toUpperCase() + b.substring(1);

        System.out.println(a.length() + b.length());
        System.out.println((a.compareTo(b)) > 0 ? "Yes" : "No");
        System.out.println(a + " " + b);
    }
}
