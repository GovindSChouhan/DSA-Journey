import java.util.*;
public class NearbyCar{
    static class point implements Comparable<point>{
        int x ;
        int y;
        int distSqr;
        int idx;

        //constructor point p
        public point(int x, int y, int distSqr, int idx){
            this.x = x;
            this.y = y;
            this.distSqr = distSqr;
            this.idx = idx;
        }
        @Override
        public int compareTo(point p2){
            return this.distSqr - p2.distSqr;//Sorting in assecending order, 
        }

    }
    public static void main(String[] args) {
        int pts[][] = {{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;

        PriorityQueue<point> pq = new PriorityQueue<>();
       for(int i = 0;i<pts.length;i++){
            int distSqr = pts[i][0]*pts[i][0] + pts [i][1]*pts[i][1];
            pq.add(new point(pts[i][0], pts[i][1], distSqr, i));//yha har varia initialize ho gya hai.
        }

        //nearest k cars
        for(int i=0;i<k;i++){
            System.out.println("c"+pq.remove().idx);
        }
    }
}