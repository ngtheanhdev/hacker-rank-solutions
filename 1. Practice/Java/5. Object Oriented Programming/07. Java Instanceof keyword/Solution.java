import java.util.ArrayList;
import java.util.Scanner;

class Student {
}

class Rockstar {
}

class Hacker {
}

public class Solution {

    static String count(ArrayList<Object> mylist) {
        int a = 0;
        int b = 0;
        int c = 0;
        for (Object obj : mylist) {
            if (obj instanceof Student) {
                a++;
            }
            if (obj instanceof Rockstar) {
                b++;
            }
            if (obj instanceof Hacker) {
                c++;
            }
        }
        return a + " " + b + " " + c;
    }

    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            if (s.equals("Student")) {
                myList.add(new Student());
            }
            if (s.equals("Rockstar")) {
                myList.add(new Rockstar());
            }
            if (s.equals("Hacker")) {
                myList.add(new Hacker());
            }
        }
        System.out.println(count(myList));
    }
}
