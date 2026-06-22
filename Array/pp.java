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