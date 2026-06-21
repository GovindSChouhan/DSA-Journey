import java.util.*;

public class R1stRlastSearch {
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

    public int removeFirst(int data){
        if(size == 0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;

        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    } 
    public int removeLast(int data){
        if(size == 0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;

        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            return val;
        }
        Node prev = head;
        for(int i = 0;i<size-2;i++){
           prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }
    //iterative Search O(n);
    public int Search(int key){
        Node temp = head;
         int i = 0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    //Recursive Search tc (n) and space o(n)
    public int helper(Node head, int key){
        Node temp = head;
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next,  key);
        if(idx == -1){
            return -1;
        }
        return idx+1;

    }
    public int RecurSear(Node head, int key){
        return helper(head, key);
    }


    public static void main(String[] args) {
        R1stRlastSearch obj = new R1stRlastSearch();
        obj.removeFirst(1);
    }
}
