// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int x) { 
        val = x; 
    }
}

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            if (p.val < root.val && q.val < root.val) {
                // Both nodes are in the left subtree
                root = root.left;
            } else if (p.val > root.val && q.val > root.val) {
                // Both nodes are in the right subtree
                root = root.right;
            } else {
                // We found the LCA (where one node is in the left and one in the right, or one is root itself)
                return root;
            }
        }
        return null;
    }
}

// Driver Code to Test the Function
public class Main {
    public static void main(String[] args) {
        // Constructing the BST
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);

        Solution solution = new Solution();
        
        TreeNode p = root.left; // Node with value 2
        TreeNode q = root.right; // Node with value 8
        System.out.println("LCA of " + p.val + " and " + q.val + " is: " + solution.lowestCommonAncestor(root, p, q).val);

        p = root.left; // Node with value 2
        q = root.left.right; // Node with value 4
        System.out.println("LCA of " + p.val + " and " + q.val + " is: " + solution.lowestCommonAncestor(root, p, q).val);
    }
}
