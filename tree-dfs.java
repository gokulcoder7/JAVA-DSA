// "static void main" must be defined in a public class.
public class Main {
    /*
            5
          /  \
         3    7
        / \    \
       1   4    9
    */
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5, new TreeNode(3, new TreeNode(1), new TreeNode(4)), new TreeNode(7, null, new TreeNode(9)));
        
        System.out.println("=== preorder ===");
        preorder(root);     // 5 3 1 4 7 9 
        System.out.println("\n=== inorder ===");
        inorder(root);      // 1 3 4 5 7 9 
        System.out.println("\n=== postorder ===");
        postorder(root);    // 1 4 3 9 7 5 
        System.out.println("\n=== levelorder ===");
        levelorder(root);   // 5 3 7 1 4 9
    }
    
    static void preorder(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }
    
    static void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
    
    static void postorder(TreeNode root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }
    
    static void levelorder(TreeNode root) {
        if (root == null) return;
        Deque<TreeNode> q = new ArrayDeque<>();
        q.addLast(root);
        while (q.isEmpty() == false) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.removeFirst();
                System.out.print(node.val + " ");
                if (node.left != null) q.addLast(node.left);
                if (node.right != null) q.addLast(node.right);
            }
            System.out.println();
        }
    }
    
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
