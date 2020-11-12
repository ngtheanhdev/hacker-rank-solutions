import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        Map<Integer, Integer> map = new HashMap<>(n);
        Deque<Integer> deque = new ArrayDeque<>(m);
        int max = 0;

        for (int i = 0; i < n; i++) {
            if (i >= m) {
                int old = deque.removeFirst();
                if (map.get(old) == 1) {
                    map.remove(old);
                } else {
                    map.merge(old, -1, Integer::sum);
                }
            }

            int num = scan.nextInt();
            deque.addLast(num);
            map.merge(num, 1, Integer::sum);

            max = Math.max(max, map.size());
            if (max == m) {
                break;
            }
        }

        scan.close();
        System.out.println(max);
    }
}
