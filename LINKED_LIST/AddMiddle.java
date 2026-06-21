public class AddMiddle {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data  = data;
            this.next = null;
        }

    }    
        public static Node head;
        public static Node tail;
        public static int size;

        public void addfirst(int data){
            Node newNode = new Node(data);
            size++;
            if(head == null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
        public void print(){
            if(head == null){
                System.out.println("not found");
                return ;
            }
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();


        }
        public void add(int idx,int data){
            if(idx == 0){
                addfirst(data);
                return;
            }
            Node newNode = new Node(data);
            Node temp = head;
            int i = 0;

            while(i<idx-1){
                temp = temp.next;
                i++;
            }
           // System.out.println();
           newNode.next = temp.next;
           temp.next = newNode;
        }
        

        public static void main(String[] args) {
            AddMiddle obj = new AddMiddle();
            obj.addfirst(2);
            obj.addfirst(1);
            obj.addfirst(3);
            obj.addfirst(4);
            obj.add(2,9);
            
            obj.print();//1->2->9->3->4


        }
    
}
