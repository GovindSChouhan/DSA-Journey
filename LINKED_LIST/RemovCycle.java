public class RemovCycle {
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
    public static int size;

      public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return ;
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
        tail.next =  newNode;
        tail = newNode;
    }
    //MAIN CODE

    //floyd algo
    public static void  RemoveCycle(){
        //detect a cycle.
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast.next != null && fast.next.next != null){
        slow = slow.next;
        fast = fast.next.next;    
            if(fast == slow){
                cycle = true;
              break;
            }
        }  
       if(cycle == false){
        return;
       }
       //check meeting point
       slow = head;
       Node prev = null;
       while(slow != fast){
        prev = fast;
        slow = slow.next;
        fast = fast.next;

       }
       prev.next = null;

    }


 
    public static void main(String[] args) {
        
    }

}
