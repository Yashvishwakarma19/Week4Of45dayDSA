class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class MaxDepthBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {
        // Create sample tree:
        //       3
        //      / \
        //     9  20
        //        / \
        //       15  7

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        MaxDepthBinaryTree obj = new MaxDepthBinaryTree();
        int height = obj.maxDepth(root);

        System.out.println("Maximum depth (height) of the tree is: " + height);
        // Expected Output: 3
    }
}
