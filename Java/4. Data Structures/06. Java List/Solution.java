import java.util.LinkedList;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int value = scan.nextInt();
            list.add(value);
        }

        int q = scan.nextInt();
        while (q-- > 0) {
            String action = scan.next();
            int index = scan.nextInt();
            if (action.equals("Insert")) {
                int value = scan.nextInt();
                list.add(index, value);
            } else {
                list.remove(index);
            }
        }
        scan.close();

        for (Integer num : list) {
            System.out.print(num + " ");
        }
    }
}
