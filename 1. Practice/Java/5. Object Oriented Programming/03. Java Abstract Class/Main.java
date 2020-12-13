import java.util.Scanner;

abstract class Book {
    String title;

    String getTitle() {
        return title;
    }

    abstract void setTitle(String s);
}

class MyBook extends Book {

    @Override
    public void setTitle(String s) {
        title = s;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        Book newNovel = new MyBook();
        newNovel.setTitle(title);
        System.out.println("The title is: " + newNovel.getTitle());
        sc.close();
    }
}
