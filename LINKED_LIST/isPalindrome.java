public class isPalindrome {
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

    //find mid;
    //then rev;
    //check left right;

    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null  && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
        }
      
        return slow;
    }
    public boolean isPalin(){
        if(head == null || head.next == null){
            return true;
        }
        Node mid = findMid(head);
        //2
        Node prev = null;
        Node curr = mid;
        Node next;
        while(curr != null){
            next = curr.next;
            curr = prev.next;
            prev = curr;
            curr = next;

        }
        Node right = prev;
        Node left = head;

        //3
        while(right !=null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    

    public static void main(String[] args) {
        
    }
}
