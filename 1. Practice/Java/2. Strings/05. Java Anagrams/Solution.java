import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        char[] a = s1.toLowerCase().toCharArray();
        char[] b = s2.toLowerCase().toCharArray();
        java.util.Arrays.sort(a);
        java.util.Arrays.sort(b);

        boolean anagram = true;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                anagram = false;
                break;
            }
        }

        return anagram;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
