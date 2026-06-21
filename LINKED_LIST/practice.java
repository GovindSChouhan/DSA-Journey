public class practice{
    public class Node{
        int data;
        Node head;
        public Node(int data){
            this.data = data;
            this.next = null;
    
        }
    }
    public static Node head ;
    public static Node tail;
    public static int size;
    public void addfirst(int data){
    Node newNode = newNode(data);
    if(head == null){
        head = tail = null;
        return;
    }
    newNode.next = head;
    head = newNode;
 }
 public void addLast(int data){
    Node newNode = newNode(data);
    if(head == null){
        head = tail = null;
        return;
    }
    tail.next = newNode;
    tail = newNode;

 }
 public void print(){
    if(head == null){
        System.out.println("ll is empty");
        
    }
    Node temp = head;
    while(head != null){
        System.out.println(temp.data+"->");
        temp = temp.next;
    }
    System.out.println("null");
 }
 public void addmid(int indx,int data){
    Node newNode = new Node(data);
    Node temp = head;
    i = 0;
    while(i<indx-1){
        temp = temp.next;
        i++;
    }
    newNode.next = temp.next;
    temp.next = newNode;
    }
    public int removeFirst(){
        if(size == 0){
            System.out.println("ll is empty");

        }
        else if(size == 1){
            int var = head.data;
            head = tail = null;
            size = 0;
            return var;
        }
        int var = head.data;
        head = head.next;
        size--;
        return val;
    }
    public void removeLast(){
        if(size == 0){
            return;
        }
        else if (size == 1){
            int val = head.data;
            head = tail = null;
            size --;
            return;
        }
        Node temp = head;
        for(int i = 0;i<size-2;i++){
            prev = prev.next; 

        }
       int val = prev.next.data;
       prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int search(int key){
        Node temp = head;
        while(head != null){
            if(temp.data == key ){
                return i;
            }
            temp = temp.next;
          
            i++;
        }
        return -1;
    }
    
    
 }

}
   
}

