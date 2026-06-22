public class basic {
    public static void counts(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
       //1step. function ka kaam print kavayega.
       
        counts(n-1);
        System.out.print(n+" ");
        
      
    }
   public static void main(String[] args){
    int n = 10;
    counts(n);
    
   

   }

}
