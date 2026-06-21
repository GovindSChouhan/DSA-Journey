public class RemFrmLast {
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

    public void remfromlast(int n){
        int size = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        if(n == size){
            head = head.next;
            return;
        }
        Node prev = head;
        int i = 1;
        while(i < size-n){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;



    }
    public static void main(String[] args) {
        RemFrmLast obj = new RemFrmLast();
        obj.remfromlast(4);
    }
}
