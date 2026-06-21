import java.util.Stack; // Import the built-in Stack class

public class collectionFram { // Renamed the class to avoid conflict
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>(); // Using the built-in Stack class
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek()); // Print the top element
            s.pop(); // Remove the top element
        }
    }
}
