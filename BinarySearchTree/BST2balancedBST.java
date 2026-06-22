import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

}
public class BST2balancedBST{

    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.data+" ");
        preorder(root.left);
        preorder(root.right);

        
    }
    