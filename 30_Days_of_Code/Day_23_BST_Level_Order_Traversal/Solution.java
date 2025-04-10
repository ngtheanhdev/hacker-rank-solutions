import java.util.ArrayDeque;
import java.util.Scanner;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Solution {

    static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        ArrayDeque<Node> deque = new ArrayDeque<>();
        deque.add(root);
        while (!deque.isEmpty()) {
            Node n = deque.removeFirst();
            System.out.print(n.data + " ");
            if (n.left != null) {
                deque.addLast(n.left);
            }
            if (n.right != null) {
                deque.addLast(n.right);
            }
        }
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Node root = null;
        while (t-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);
    }
}
