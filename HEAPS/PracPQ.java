import java.util.*;
public class PracPQ{
    static class point implements Comparable<point>{
        int x;
        int y;
        int disSqr;
        int idx;

        //constructor;
        public point(int x, int y , int disSqr, int idx){
            this.x = x;
            this.y =  y;
            this.disSqr = disSqr;
            this.idx = idx;
        }
        public int compareTo( point p2){
            return this.disSqr - p2.disSqr;
        }
    }
    public static void main(String[] args) {
        int pt[][] = {{3,3} , {5,-1}, {-2,4}};
            int k = 2;

            PriorityQueue<point> pq = new PriorityQueue<>();
                for(int i = 0;i<pt.length;i++){
                    int distSqr = pt[i][0]*pt[i][0] + pt[i][1]*pt[i][1];
                    pq.add(new point(pt[i][0] , pt[i][1], distSqr, i));
                }
        
        for(int i = 0;i<k;i++){
            System.out.println("c"+pq.remove().idx);
        }
    }

}