class Node{
    int data;
    Node right;
    Node left;

    Node (int data){
        this.data = data;
        this.right = null;
        this.left = null;
    }
}   
public class LCAncestor2 { 
    public static Node lca(Node root ,int n1 ,int n2){
        if(root == null){
            return null;
        }
        if(root.data == n1 || root.data == n2){
            return root;
        }
        Node leftLca = lca(root.left, n1 , n2);
        Node rightLca = lca(root.right, n1 , n2);

        //leftLCA = val right LCA = null;
        if(rightLca == null){
            return leftLca;
        }
        return root;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4, n2 = 7;
        System.out.println(lca(root , n1, n2).data);
    }
}
