import java.util.Scanner;
import java.util.Stack;

public class NextGrtElmt{
    public static void main(String[] args) {
        
    
    Stack <Integer> s = new Stack<>();
    int arr[] = {6,8,0,1,3};
    int NextGrtElmt[] = new int[arr.length];

    for(int i=arr.length-1; i>=0; i--){

        while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
            s.pop();
        }if(s.isEmpty()){
            NextGrtElmt[i] = -1;
        }else{
            NextGrtElmt[i] = arr[s.peek()];
        }
        s.push(i);

    }
    for(int i = 0;i<NextGrtElmt.length;i++){
        System.out.println(NextGrtElmt[i]+" ");
    }
}
    
    
}