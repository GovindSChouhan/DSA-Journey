import java.util.*;
public class basic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of elmnt");
        int count = sc.nextInt();


            System.out.println("enter"+count);
            int[] num = new int[count];

            for(int i = 0;i<count;i++){
                System.out.println("num"+(i+1));
                num[i] = sc.nextInt();

            }
            System.out.println("u entered");
            for(int i = 0;i<num.length;i++){
                System.out.print(+num[i]+",");
                if(num[i]%2==0){
                    System.out.println("even");
                }else{
                    System.out.println("num is odd ");
                }
               
            }
            

         

        
    }
}