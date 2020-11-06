import java.util.Scanner;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        for (int i = 0; i < game.length; i++) {
            if (game[i] == 1) {
                return (i - 1 + leap) > game.length;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }
}
