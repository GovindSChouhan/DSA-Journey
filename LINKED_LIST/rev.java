import java.util.*;
public class rev {
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void rev(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
           next = curr.next;
           curr.next = prev;
           prev = curr;
           curr = next;
            
        }
        head = prev;
    }
    public static void main(String[] args) {
        rev obj = new rev();
        obj.rev();
        
    }
}
                     
