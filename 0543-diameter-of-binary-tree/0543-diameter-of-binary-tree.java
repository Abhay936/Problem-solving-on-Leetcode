/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int heightBT(TreeNode root){
        if(root==null) return 0;
        return Math.max(heightBT(root.left),heightBT(root.right))+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        TreeNode temp = root;
        int h1 = heightBT(root.left);
        int h2 = heightBT(root.right);
        int curr = h1+h2;
        return Math.max(h1+h2,Math.max(diameterOfBinaryTree(root.left),diameterOfBinaryTree(root.right)));
    }
}