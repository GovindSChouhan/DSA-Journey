import java.util.*;
public class CountNRopes{
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        //int ropes[] = {4, 3, 2, 6};
        int ropes[] = {2, 3, 3, 4, 6};
        for(int i = 0;i<ropes.length;i++){
            pq.add(ropes[i]);
        }
        int cost = 0;
        while(pq.size() >1){
            int min = pq.remove();
            int min2 = pq.remove();
            cost += min+min2;
            pq.add(min+min2);
        }
        System.out.println("cost of connecting n ropes:: "+cost);
    }
}