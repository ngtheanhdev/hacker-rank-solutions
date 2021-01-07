import java.util.Scanner;
import java.util.Stack;

class Solution {

    public static void main(String[] argh) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            Stack<Character> stack = new Stack<>();
            String line = scanner.nextLine();
            for (char c : line.toCharArray()) {
                if (c == '{' || c == '(' || c == '[') {
                    stack.push(c);
                    continue;
                }

                if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                    continue;
                }

                if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                    continue;
                }

                if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                    continue;
                }

                if (c == '}' || c == ')' || c == ']') {
                    stack.push(c);
                    break;
                }
            }
            System.out.println(stack.isEmpty());
        }
    }
}
