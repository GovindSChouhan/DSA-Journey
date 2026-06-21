import java.util.ArrayList;
public class ppointerapp{
    public static int maxwater(ArrayList<Integer> height){
        int maxwater = 0;
        int lp = 0;
        int rp = height.size()-1;
        //area
        while(lp<rp){
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp-lp;
            int currwater = ht*width;

            maxwater = Math.max(maxwater, currwater);

            //update;
            if(height.get(lp) < height.get(rp)){
                lp++;

            }else{
                rp--;
            }

        }
        return maxwater;

    }
    public static void main(String[] args) {
       ArrayList<Integer> height = new ArrayList<>();

       height.add(1);
       height.add()
    }
} 