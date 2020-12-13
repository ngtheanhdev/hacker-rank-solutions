import java.util.Scanner;

interface AdvancedArithmetic {
    int divisorSum(int n);
}

class MyCalculator implements AdvancedArithmetic {

    @Override
    public int divisorSum(int n) {
        int sum = 0;
        int sqrt = (int) Math.sqrt(n);
        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) { // if "i" is a divisor
                sum += i + n / i; // add both divisors
            }
        }
        /* If sqrt is a divisor, we should only count it once */
        if (sqrt * sqrt == n) {
            sum -= sqrt;
        }
        return sum;
    }
}

class Solution {

    public static void main(String[] args) {
        AdvancedArithmetic myCalculator = new MyCalculator();
        System.out.print("I implemented: ");
        implementedInterfaceNames(myCalculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(myCalculator.divisorSum(n) + "\n");
        sc.close();
    }

    static void implementedInterfaceNames(Object o) {
        Class<?>[] theInterfaces = o.getClass().getInterfaces();
        for (Class<?> theInterface : theInterfaces) {
            String interfaceName = theInterface.getName();
            System.out.println(interfaceName);
        }
    }
}

