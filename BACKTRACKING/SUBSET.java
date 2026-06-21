public class SUBSET {
    public static void findSubsets(String str, String ans, int i) {
        // Base case: when we reach the end of the string
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null"); // Print "null" for the empty subset
            } else {
                System.out.println(ans); // Print the current subset
            }
            return;
        }

        // Yes choice: include the current character in the subset
        findSubsets(str, ans + str.charAt(i), i + 1);

        // No choice: exclude the current character from the subset
        findSubsets(str, ans, i +1);
    }top

    public static void main(String args[]) {
        String str = "abc";
        findSubsets(str, "", 0); // Start with an empty subset
    }
}