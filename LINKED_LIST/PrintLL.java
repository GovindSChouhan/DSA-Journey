//import java.util.LinkedList;

public class PrintLL {
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
   public static Node tail;
   public static Node head;

   public void addLast(int data){
      Node newNode = new Node(data);
      if(head == null){
         head = tail = newNode;
         return;
        }
      tail.next = newNode;
      tail = newNode; 

    }
    
    public void print(){
        if(head == null){//Check if the linked list is empty:
            System.out.println("ll is empty");
            return;
        }
        Node temp = head;//to keep track of the current node
        //jaesey refrence move karega ek node se next node temp bhi move karega
        while(temp != null){
            System.out.print(temp.data+" ");//temp.data+means current value of the NODE
            temp = temp.next;//moves temp to the next node in the list.

    
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PrintLL obj = new PrintLL();
       
        obj.print();
        obj.addLast(2);
        obj.print();
        obj.addLast(1);
        obj.print();
        obj.addLast(3);
        obj.print();
        obj.addLast(4);
        obj.print();
       
        

    }

   

}
