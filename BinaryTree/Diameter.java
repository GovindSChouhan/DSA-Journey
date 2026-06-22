public class Diameter {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class Info{
        int diam;
        int ht;

        public Info(int diam,int ht){
            this.diam = diam;
            this.ht = ht;
        }

    }
    public static Info Diameter(Node root){

        if(root == null){
            return new Info(0, 0);
        }
        Info leftInfo = Diameter(root.left);
        Info rightInfo = Diameter(root.right);
       

        int Diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht+1);
        int ht = Math.max(leftInfo.ht,rightInfo.ht)+1;

        return new Info(Diam,ht);

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(Diameter(root).diam);
    }
}
