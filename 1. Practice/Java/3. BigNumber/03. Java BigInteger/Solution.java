import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numb1 = scanner.nextLine();
        String numb2 = scanner.nextLine();

        System.out.println(new BigInteger(numb1).add(new BigInteger(numb2)));
        System.out.println(new BigInteger(numb1).multiply(new BigInteger(numb2)));
    }
}
