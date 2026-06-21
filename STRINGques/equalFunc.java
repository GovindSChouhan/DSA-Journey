public class equalFunc {
    public static void main(String[] args) {
        String s1 = "gov";
        String s2 = "gov";
        String s3 = new String ("gov");

       // if(s1 == s2){
       // System.out.println("String q equal");
    
   // }else{
       // System.out.println("String r not equal");
  ////  }
  //  if(s1 == s3){
    //    System.out.println("string r equal");
 //   }else{
    //    System.out.println("String are not equal");
  //  }
    if(s1.equals(s3)) {
        System.out.println("string are equals");
    } else{
        System.out.println("string are not equals");
    }
}
}
