public class AddLast {
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data= data;
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
    public static void main(String[] args) {
        AddLast obj = new AddLast();
        obj.addLast(1);
        obj.addLast(2);
    }
}
