public class HeightOfTreeAll {
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

    // Height of TREE
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    // Sum of all nodes in the tree
    public static int Sum(Node root) {
        if (root == null) {
            return 0;
        }
        int LS = Sum(root.left);
        int RS = Sum(root.right);
        return LS + RS + root.data;
    }

    // Corrected Diameter of TREE O(N ka square).
    public static int Diam(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);

        int lftDiam = Diam(root.left);
        int rigtDiam = Diam(root.right);

        int selfDiam = lh + rh + 1;

        return Math.max(selfDiam, Math.max(lftDiam, rigtDiam));
    }

    // COUNT NUMBER OF NODES
    public static int Count(Node root) {
        if (root == null) {
            return 0;
        }
        int LC = Count(root.left);
        int RC = Count(root.right);
        return LC + RC + 1;
    }
    //Diameter of TREE O (N)
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

        System.out.println("Height of Tree: " + height(root));
        System.out.println("Count of Nodes: " + Count(root));
        System.out.println("Sum of Nodes: " + Sum(root));
        System.out.println("Diameter of Tree: " + Diam(root));

        System.out.println("Diameter of the tree O(n)"+Diameter(root).diam);
    }
}
