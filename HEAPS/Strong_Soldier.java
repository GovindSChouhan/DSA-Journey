import java.util.*;
public class Strong_Soldier {
    static class row implements Comparable<row>{
        int soldier;
        int idx;

       public row(int soldier, int idx){
            this.soldier = soldier;
            this.idx = idx;

        }
        @Override
        public int compareTo(row r2){
            if(this.soldier == r2.soldier){//if solder jata hai tho idx k bsese pr 
                return this.idx -r2.idx;
            }else{
                return this.soldier - r2.soldier;
            }// nhi tho solder k bases per jismai jata solde ho 
        }
    }    
        public static void main(String[] args) {
            int army[][] = {{1, 0, 0, 0},
                            {1, 1, 1, 1},
                            {1, 0, 0, 0},
                            {1, 0, 0, 0}};

                            int k = 2;
                    //har row per jana
            PriorityQueue<row> pq = new PriorityQueue<>();
            for(int i = 0;i<army.length;i++){//row number 0,1,2,3 *4 becoz 4 row hai
                int count = 0;
                for(int j = 0;j<army[0].length;j++){//us row k coloum per chalna
                    count += army[i][j] == 1 ? 1 :0;// count = count + 1;
                }
                pq.add(new row(count , i));
            }

            for(int i = 0;i<k;i++){
                System.out.println("r"+pq.remove().idx);
            }

                         
        }
    
}
