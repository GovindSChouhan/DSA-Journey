import java.util.Stack;

public class ValidParenthe {
    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();

        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){//openning case
                s.push(ch);
            } else {//mean closing case1.chek if stack is empty mean phale closing ho openning nhi
                if(s.isEmpty()){
                    return false;
                }
                if ((s.peek() == '(' && ch == ')') || 
                    (s.peek() == '{' && ch == '}') || 
                    (s.peek() == '[' && ch == ']')) {
                    s.pop();

                } else {
                    return  false;
                }
            }
        }
        if(s.isEmpty()){
            return true;

        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str = "({})[}}]";
        System.out.println(isValid(str)); 
    }
}
