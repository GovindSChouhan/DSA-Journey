import java.util.*;

public class zig_zag {
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

    //mid
    //rev
    //palin cond chack.
    public void zigzag(){
        Node slow = head;
        Node fast =  head;
        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next;
            
        }
        Node mid = slow;
        //rev
        Node curr = mid.next; 
        Node prev = null;
        Node next;
        while(fast != null && fast.next != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        //Palin checkCondn
        Node right_h = prev;//not tail
        Node left_h = head;
        Node left_nxt, right_nxt;
       
        while(left_h != null && right_h != null){
            left_nxt = left_h.next;
            left_h.next = right_h;
            right_nxt = right_h.next;
            right_h.next = left_nxt;

            right_h = right_nxt;
            left_h = left_nxt;

        }
    }
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(2);
        ll.add(2);
    }
}
