public class BinaryTreeTraversal {

    // Definition for a binary tree node
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            left = right = null;
        }
    }

    // Root of the tree
    TreeNode root;

    public BinaryTreeTraversal() {
        root = null;
    }

    // In-order traversal: Left, Root, Right
    public void inOrder(TreeNode node) {
        if(node==null)
        {
          return;
        }
        
        inOrder(node.left);
        System.out.print(node.val+" ");
        inOrder(node.right);
    }

    // Pre-order traversal: Root, Left, Right
    public void preOrder(TreeNode node) {
        if(node==null)
        {
          return;
        }
        System.out.print(node.val+" ");
        preOrder(node.left);
        preOrder(node.right);
        
    }

    // Post-order traversal: Left, Right, Root
    public void postOrder(TreeNode node) {
        if(node==null)
        {
          return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val+" ");
    }

    // Sample tree creation for testing
    public void createSampleTree() {
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        
    }

    public static void main(String[] args) {
        BinaryTreeTraversal tree = new BinaryTreeTraversal();
        tree.createSampleTree();

        // Call traversal methods here
        System.out.print("In order traversal: "); 
        tree.inOrder(tree.root);
        System.out.println();
        System.out.print("Pre Order traversal: ");
        tree.preOrder(tree.root);
        System.out.println();
        System.out.print("Post order traversal: ");
        tree.postOrder(tree.root);
        System.out.println();
    }
}
