import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lineNum = 0;
        while (scan.hasNext()) {
            System.out.println(++lineNum + " " + scan.nextLine());
        }
        scan.close();
    }
}
