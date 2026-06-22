public class rev {
      public static void rev(int arr[]){
        int first = 0;
        int last = arr.length-1;

        while(first < last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;    
        }



    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        rev(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]);
        }

       
    }
}
public class pp{
    public static String rev(String s ){
        char ch[] = s.toCharArray();
        int start = 0;
        int end = ch.length-1;

        while(start < end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start ++;
            end--;
        }
        return new String(ch);
        
        //return res;
    }
    public static void main(String[] args) {
        String s = "the sky is blue";
       System.out.println(rev(s));

    }
}
