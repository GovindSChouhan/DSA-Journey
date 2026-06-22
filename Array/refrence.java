import java.util.Scanner;
public class refrence {
    public static void  update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

           int marks[] = {97,98,99};
           //System.out.println("enter the marks ");
           //marks[0] = sc.nextInt();

           update(marks);
           for(int i =0;i<marks.length;i++){
            System.out.println(marks[i]+" ");
           }
           System.out.println();
        
    }
    
}
