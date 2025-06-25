//Back-end complete function Template for Java

class Solution {
    // Function to return the level order traversal of a tree.
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        if (root == null) return new ArrayList<>();

        // Create an empty queue for level order traversal
        Queue<Node> q = new LinkedList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        // Enqueue Root
        q.add(root);
        int currLevel = 0;

        while (!q.isEmpty()) {
            int len = q.size();
            res.add(new ArrayList<>());

            for (int i = 0; i < len; i++) {
                // Add front of queue and remove it from queue
                Node node = q.poll();
                res.get(currLevel).add(node.data);

                // Enqueue left child
                if (node.left != null) q.add(node.left);

                // Enqueue right child
                if (node.right != null) q.add(node.right);
            }
            currLevel++;
        }
        return res;
    }
}
