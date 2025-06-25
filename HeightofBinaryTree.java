// Height of Binary Tree
// Difficulty: EasyAccuracy: 78.58%Submissions: 326K+Points: 2Average Time: 15m

// Given a binary tree, find its height.

//     The height of a tree is defined as the number of edges on the longest path from the root to a leaf node. A leaf node is a node that does not have any children.






/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 */

class Solution {
    // Function to find the height of a binary tree.
    int height(Node node) {
        // code here
        if(node==null)
        return -1;
        
        
        int left=height(node.left);
        int right=height(node.right);
        
        return Math.max(left,right)+1;
    }
}
