import java.util.*;
public class All_Operation{
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

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head =  tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }
    public void addMiddle(int data, int idx){
        if(idx == 0){
            addFirst(data);
            return ;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i<idx-1){
            temp = head.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
       
        
    }
     
    public static void Print(){
        if(head == null){
            System.out.println("ll is empty");
        }
       Node temp = head;
        while(temp != null){
            System.out.println(temp.data+"->");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        All_Operation obj = new All_Operation();
        obj.addFirst(2);
        obj.addFirst(1);
        obj.addLast(3);
        obj.addLast(4);
        All_Operation.Print();
        obj.addMiddle(9, 3);
         All_Operation.Print();
         System.out.println(obj.size);
    }
}
