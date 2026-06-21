o(n)
class Solution {
    public boolean rotateString(String s, String goal) {

        if (s.length() != goal.length())
            return false;

        String doubled = s + s;

        return doubled.contains(goal);
    }
}
o(n ka squeare )|
class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        StringBuilder sb = new StringBuilder(s);
        while(true){
            char ch = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(ch);

            n--;

            if(s.length() == 0 && sb.toString().equals(goal)){
                break;
            }
        }
        return sb.toString().equals(goal);
    }
}