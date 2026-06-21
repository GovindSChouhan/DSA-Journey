import  java.util.*;
public class pracc {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
        
    }
    public static Node head ;
    public static Node tail;
    public static int size;

    public int helper(Node head , int key){
        Node temp = head;
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper( head.next,key){
            if(idx == -1){
                return -1;
            }
           return idx+1;
            
        }
    }

    public int recurSear(Node head, int key){
       return helper(head, key);
    }

    public static void main(String[] args) {
        pracc obj  = new pracc();
        this.data = data;
    }

   
}
