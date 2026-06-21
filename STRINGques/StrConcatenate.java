public class StrConcatenate {
    public static void print(String str){
      for(int i = 0;i<str.length();i++){
        System.out.println(str.charAt(i)+ " ");
      }
      System.out.println();
    }
    public static void main(String[] args) {
        String firstName = "Govi898nd";
        String lastName = "chouh89an";

       String fullName = firstName + " " + lastName;
       System.out.println(fullName);
    }
}
