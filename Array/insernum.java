import java.util.Arrays;
public class insernum{
  public static void main(String[] args) {
   
     int arr[] = {12,13,14,15,16,17};
    int index_position = 0;
    int newNum = 23;

    System.out.println("original arry"+Arrays.toString(arr));

    int newArr[] = new int[arr.length+1];//newArr with a size of arr.length + 1 to accommodate the new number.

    for(int i = newArr.length-1;i>index_position;i--){
      newArr[i] = arr[i-1];
    }

    newArr[index_position] = newNum;
    for(int i =0;i<index_position;i++){
      newArr[i] = arr[i];
    }
    System.out.println("new Arrays"+Arrays.toString(newArr) );
  }
}