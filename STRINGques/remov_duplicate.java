import java.util.*;
public class remov_duplicate{
  public static String duplicate(String str){
    StringBuilder result = new StringBuilder();
    for(int i = 0;i<str.length();i++){
      char currChar = str.charAt(i);
      boolean isduplicate = false;

      for(int j = 0;j<result.length();j++){
        if(result.charAt(j) == currChar){
          isduplicate = true;
          break;
        }
      }
      if(!isduplicate){
        result.append(currChar);
      }
    }
    return result.toString();
  }
  public static void main(String args[]){
   // String input = "heelo ji";
    System.out.println(duplicate("Inddia"));
  }

}  