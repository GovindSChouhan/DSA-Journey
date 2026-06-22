import java.util.List;
import java.util.ArrayList;

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;  
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    static int idx = -1;

    // Build the tree using the given nodes array
    public TreeNode buildTree(int[] nodes) {
        idx++;
        if (idx >= nodes.length || nodes[idx] == -1) {
            return null;
        }
        
        TreeNode newNode = new TreeNode(nodes[idx]);  // Create a new node
        newNode.left = buildTree(nodes);  // Recursively build the left subtree
        newNode.right = buildTree(nodes); // Recursively build the right subtree

        return newNode;
    }

    // Perform preorder traversal (root -> left -> right)
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderHelper(root, result);
        return result;
    }

    // Helper function to perform preorder traversal
    private void preorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) {
            return; // Base case
        }
        
        result.add(node.val);  // Visit the root node
        preorderHelper(node.left, result);  // Traverse the left subtree
        preorderHelper(node.right, result); // Traverse the right subtree
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example input
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, 7, -1, -1, -1};
        
        // Build the tree
        TreeNode root = solution.buildTree(nodes);
        
        // Perform preorder traversal
        List<Integer> result = solution.preorderTraversal(root);
        
        // Print the result of preorder traversal
        System.out.println(result);  // Output: [1, 2, 4, 5, 3, 6, 7]
    }
}
