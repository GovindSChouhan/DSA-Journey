import java.util.*;
class Info{
    int hd;
    Node node;

     Info(Node node,int hd){
        this.node = node;
        this.hd = hd;
    }

}
class TVoftree{
    public static void  topview(Node root){
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0,max = 0;
        q.add(new Info(root, 0));
        q.add(null);

        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else {
                if(!map.containsKey(curr.hd)){
                    map.put(curr.hd, curr.node);
                }
                if(curr.node.left != null){
                    q.add(new Info(curr.node.left, curr.hd-1));
                    min = Math.min(min, curr.hd-1);
                }
                if(curr.node.right != null){
                    q.add(new Info(curr.node.right, curr.hd+1));
                    max = Math.max(max, curr.hd+1);
                }

            }

         
        }
      for(int i = min;i<=max;i++){
          System.out.println(map.get(i).data + " ");

        }  
        System.out.println();
    }
    public static void main(String[] args) {
       
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);


        //Node subRoot = new Node(2);
       // subRoot.left = new Node(4);
        //subRoot.right = new Node(5);

        topview(root);
        //System.out.println(isSubtree(root, subRoot));
        
    }
        
    
}
//Default (Package-Private) Access Modifier: When no access modifier is specified, the constructor has default (also known as package-private) access. This means the constructor is accessible only within the same package. If classes from another package try to instantiate Info, they will not be able to do so.
//Access Modifier: The public access modifier means that the constructor is accessible from anywhere outside the class. This allows instances of the class Info to be created from any other class in the application or even from outside the package (if packages are used).
//Usage: This is commonly used when you want your class to be widely accessible and instantiable from various parts of your program.