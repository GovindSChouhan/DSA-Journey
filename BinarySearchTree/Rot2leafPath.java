import java.util.*;
class Node{
    int data;
    Node right;
    Node left;

    Node(int data){
        this.data = data;
        this.right = null;
        this.left = null;
    }
}


public class Rot2leafPath {

    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
    
        if(root.data > val){//left subtree mean val choti hai root say
           root.left = insert(root.left, val);
        }
        else{
         root.right = insert(root.right, val);
        }
        return root;
    }
    
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void printPath(ArrayList<Integer> path){
        for(int i = 0;i<path.size();i++){
           System.out.print(path.get(i)+"->");
        } 
        System.out.println("Null");
    }
   
    public static void printRoot2leaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }

        path.add(root.data);
        if(root.left == null && root.right == null){
          printPath(path);
        }
        

        printRoot2leaf(root.left, path);
        printRoot2leaf(root.right, path);
        path.remove(path.size()-1);

    }
    public static void main(String[] args) {
        int values[] = {8,5,3,6,10,11,14};
        Node root = null;

        for(int i = 0; i<values.length;i++){
           root =  insert(root,values[i]);
        }
        inorder(root);
        System.out.println();

        printRoot2leaf(root, new ArrayList<>());
    }
}
