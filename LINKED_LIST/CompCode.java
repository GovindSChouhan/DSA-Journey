public class CompCode{
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
    public  void addFirst(int data){
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

    public void print(){

        if(head == null){
            System.out.println("ll is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
        System.out.print(temp.data+"-> ");
       temp =  temp.next;
        }
        System.out.println("null");

        
    }
        //middle add game
      public void add(int ndx,int data){
      Node newNode = new Node(data);
      size++;      
     Node temp = head;
      int i = 0;
       while( i < ndx-1){
        temp = temp.next;
        i++;
       }

       newNode.next = temp.next;
       temp.next = newNode;
    
    }
    public int removeFirst(){
        if(size == 0){
            System.out.println(" ll is empty");

            
        }else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
            
        }
        int val = head.data;
        head= head.next;
        size--;
        return val;

    }
    public int removeLast(){
        if(size == 0){
            System.out.println("ll is empty");
         //   return Interger.MIN_VALUE;
        } else if(size == 1){//head and tail both  delete
            int val = head.data;
            head = tail = null;
            size = 0;
        }   return val;

       //prev : i = size -2;
       Node prev = head; 
       for(int i = 0;i<=size-2;i++){
        prev = prev.next;

       }
       int val = prev.next.data;
       prev.next = null;
       tail = prev; 
       size --;
       return val;
    }

    public int search(int key){
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
    public void reverse(){//o(n);
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public void deleteFromEnd(int n){
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }
        if(sz == n){
            head = head.next;
            return;
        }
        int i = 1;
        Node prev = head;
        int inx = sz-n;
        while(i<inx){
            prev = prev.next;
            i++;
            
        }
        prev.next = prev.next.next;
        return;
    }

  
    public static void main(String[] args) {
        CompCode obj = new CompCode();
        obj.print();
        obj.addFirst(2);
        obj.print();
        obj.addFirst(1);
        obj.print();
        //obj.addFirst(11);
       // obj.print();
        obj.addLast(4);
        obj.print();
        obj.addLast(5);
        obj.add(2,3);
        obj.print();
        System.out.println(obj.size);
        //obj.removeFirst();
       // obj.print();
       obj.deleteFromEnd(3);
       obj.print();

        System.out.println(obj.search(3));
        System.out.println(obj.search(10));
       // obj.reverse();
        obj.print();


    }
}