import java.util.*;

public class PqforClass{   
    static class student implements Comparable<student>{//jb priority define karna ho name.. k bases per tho yee imp
        String name;//sakthi(power) ki class apney obj ko compare kr sakthi hai.
        int rank;

        public student(String name , int rank){
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(student s2){
            return this.rank - s2.rank;
        }
        
    }
    public static void main (String args[]){

        //PriorityQueue<student> pq = new PriorityQueue<>();
        PriorityQueue<student> pq= new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new student("A",4));//o(logn)
        pq.add(new student("B",5));//addthe elemnt to thequeue
        pq.add(new student("c",2));
        pq.add(new student("d",12));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name +"+ -> "+pq.peek().rank); //0(1);
            pq.remove();//o(logn);
        }
    }
}