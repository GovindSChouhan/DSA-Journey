import java.util.LinkedList;

public class basic {
    public static class node{
        int data;
        node next;
        public node(int data){
            this.data= data;
            this.next = null;
        }
    }
    public static node head;//property
    public static node tail;

    public static void main(String[] args) {
        LinkedList obj = new LinkedList();///create ll
        obj.head = new node(1);
        obj.head.next = new node(2);
        //make methods
    }
}
