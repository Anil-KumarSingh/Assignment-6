import java.util.Stack;

public class sorting {

    // Inserts an element at the bottom of the stack
    void insert(Stack<Integer> s, int element) {
        if (s.isEmpty()) {
            s.push(element);
            return;
        }
        int top = s.pop();
        insert(s, element);
        s.push(top);
    }

    // Reverses the stack using recursion
    void reverse(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverse(s);
        insert(s, top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(4);
        s.push(1);
        s.push(3);
        s.push(2);

        sorting sorter = new sorting();
        sorter.reverse(s);

        System.out.println("Reversed Stack:");
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}