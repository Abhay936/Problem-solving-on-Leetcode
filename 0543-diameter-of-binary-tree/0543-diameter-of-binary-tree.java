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
    int dia = 0;
    public int heightBT(TreeNode root){
        if(root==null) return 0;
        int h1 = heightBT(root.left);
        int h2 = heightBT(root.right);
        dia = Math.max(dia,h1+h2); 
        return Math.max(h1,h2)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        heightBT(root);
        return dia;
    }
}