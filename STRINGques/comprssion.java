import java.util.Scanner;
public class comprssion{
    public static int compress(string str){
        for(int i = 0;i<str.length();i++){
        integer count = 1;
        while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
            count++;
            i++;
        }
        newStr += str.charAt(i);
        if(count>1){
            newStr += count.toString();
        }
    }
    return newStr;
}

}
public static void main(String[] args) {
    String str = "aaabbbccc";
}