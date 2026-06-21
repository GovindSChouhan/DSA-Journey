import java.util.Stack;

public class PUSHatBottom {
    // Correct the method signature to use 'Stack<Integer>' and consistent naming
    public static void PUSHatBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop(); // Remove and store in pop
        PUSHatBottom(s, data); // Call recursively to add data at bottom
        s.push(top); // Push the stored element back
    }

    public static void main(String[] args) {
        Stack<Integer> obj = new Stack<>(); // Correct 'Stack<Integer>' and consistent naming
        obj.push(1);
        obj.push(2);
        obj.push(3);

        PUSHatBottom(obj, 100);

        while (!obj.isEmpty()) {
            System.out.println(obj.peek());
            obj.pop();
        }
    }
}
