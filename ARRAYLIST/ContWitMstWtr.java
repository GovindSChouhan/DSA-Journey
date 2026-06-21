import java.util.ArrayList;
public class ContWitMstWtr {
    public static int Waterlvl(ArrayList<Integer> height){
        int maxwater = 0;
        //brude force  0(n^2);
        for(int i = 0;i< height.size();i++){//  for the first line 
            for(int j = 0;j<height.size();j++){ // for the second line 
                int ht = Math.min(height.get(i), height.get(j)); // 
                int width = j-i;
               int currWater = ht * width;
                maxwater = Math.max(maxwater, currWater);
            } 


        }
        return maxwater;
    }
public static void main(String[] args) {
    ArrayList<Integer> height = new ArrayList<>();
    height.add(1);
    height.add(8);
    height.add(2);

    height.add(5);
    height.add(4);
    height.add(8);
    height.add(3);
    height.add(7);

    System.out.println(Waterlvl(height));



}
   
    
}

