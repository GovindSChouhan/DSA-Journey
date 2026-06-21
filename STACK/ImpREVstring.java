import java.util.Stack;

public class ImpREVstring {
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
    
}