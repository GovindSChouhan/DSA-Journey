class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s.trim());
        
        sb.reverse();
        int n = sb.length();
        int start = 0;
        int end = 0;
        while(start < n){
             while (start < n && sb.charAt(start) == ' ')
                start++;
                if(start >= n) break;

            end = start;
        while(end < n && sb.charAt(end) != ' ')
            end++;
            reverseinRange(sb, start, end-1);
            start = end+1;
           

        }
        return sb.toString();

    }
   public void reverseinRange(StringBuilder sb ,int i ,int j){
        while(i<j){
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;
        }    
    }
}public class Solution {
    public String reverseWords(String s) {
        if (s == null) return null;
        
        char[] a = s.toCharArray();
        int n = a.length;
        
        // 1. Reverse the entire character array
        reverse(a, 0, n - 1);
        
        // 2. Reverse each word and clean up spaces
        return cleanSpaces(a, n);
    }

    private String cleanSpaces(char[] a, int n) {
        int i = 0, j = 0;
        while (j < n) {
            while (j < n && a[j] == ' ') j++;             // skip leading spaces
            while (j < n && a[j] != ' ') a[i++] = a[j++]; // keep word
            while (j < n && a[j] == ' ') j++;             // skip trailing spaces
            if (j < n) a[i++] = ' ';                      // add single space
        }
        return new String(a).substring(0, i);
    }

    private void reverse(char[] a, int i, int j) {
        while (i < j) {
            char t = a[i];
            a[i++] = a[j];
            a[j--] = t;
        }
    }
}
