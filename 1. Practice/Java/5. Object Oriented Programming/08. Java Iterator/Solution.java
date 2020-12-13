import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Solution {

    static Iterator<Object> func(ArrayList<Object> myList) {
        Iterator<Object> it = myList.iterator();
        while (it.hasNext()) {
            Object element = it.next();
            boolean isString = element instanceof String;
            if (!isString) {
                it.remove();
            }
            if (element.equals("###"))
                break;
        }
        return it;

    }

    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            myList.add(sc.nextInt());
        }

        myList.add("###");
        for (int i = 0; i < m; i++) {
            myList.add(sc.next());
        }

        Iterator<Object> it = func(myList);
        while (it.hasNext()) {
            Object element = it.next();
            System.out.println((String) element);
        }
    }
}
