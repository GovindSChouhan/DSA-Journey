import java.util.Stack;

public class IsDuplicate {

    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check for closing parenthesis
            if (ch == ')') {
                int count = 0;

                // While the top of the stack is not an opening parenthesis
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }

                // Check for duplicate if no characters between parentheses
                if (count < 1) {
                    return true; // Duplicate found
                } else {
                    s.pop(); // Pop the opening parenthesis
                }
            } else { // Push opening parenthesis or other characters onto the stack
                s.push(ch);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String str1 = "((a+b))"; // true, because of duplicate parentheses
        String str2 = "(a-b)";   // false, no duplicate parentheses

        System.out.println(isDuplicate(str1)); // Should print: true
        System.out.println(isDuplicate(str2)); // Should print: false
    }
}
