import java.util.Scanner;
    public class linearSearch{
        public static int Search(int num[],int key){
            for(int i = 0; i<num.length ; i++){
              if(num[i] == key){
                return i;
            }
             
        }
            return -1;
    }
    public static int find(int nums[]){
        int n1 = nums.length+1;
        for(int g = 0 ;g<= nums.length;g++){
            int sum1 = n1*(n1+1)/2;
            int result  = sum1;            

        }
        int result;
    }
        public static void main(String[] args) {
            int nums[] = {1,2,4,5};
            System.out.println(find(nums));
            // int num[] = {1,3,5,7,9};
            // int key = 7;


            // int index = Search(num,key);
            // System.out.println("index is "+index);
    }
}   
