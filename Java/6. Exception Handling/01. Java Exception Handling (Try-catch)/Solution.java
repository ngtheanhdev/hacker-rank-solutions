import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println(a / b);
        } catch (InputMismatchException exception) {
            System.out.println(exception.getClass().getName());
        } catch (ArithmeticException exception) {
            System.out.println(exception.getClass().getName() + ": / by zero");
        }
    }
}
