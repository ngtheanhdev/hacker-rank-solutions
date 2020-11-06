import java.util.Scanner;

public class Solution {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        byte t = SCANNER.nextByte();
        while (t-- > 0) {
            String s = SCANNER.next();
            StringBuilder evens = new StringBuilder();
            StringBuilder odds  = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (i % 2 == 0) {
                    evens.append(ch);
                } else {
                    odds.append(ch);
                }
            }
            System.out.println(evens + " " + odds);
        }
    }
}
