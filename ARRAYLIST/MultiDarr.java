import java.util.ArrayList;

public class MultiDarr {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); 
        list.add(2);
        mainList.add(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3); 
        list2.add(2);
        mainList.add(list2);

        for(int i = 0;i<mainList.size();i++){// Move to the next class ,,//Moves through rows
            ArrayList<Integer> currList = mainList.get(i); // Take out one class
            for(int j = 0;j<currList.size();j++){  // Read each student's roll number,, /Moves through numbers in that row

                System.out.print(currList.get(j)+ " ");
            }
            System.out.println();
        }

       
        System.out.println(mainList);


    }
    
}
