/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int data;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int val) { data = val; left = null, right = null }
 * }
 **/

class Solution {
    public boolean isSymmetric(TreeNode root) {
        //your code goes here
        return root==null || isSymmetrichelp(root.left,root.right);

    }
    private boolean isSymmetrichelp(TreeNode Left,TreeNode Right){
        if(Left==null || Right==null){
            return Left==Right;
        }
        if(Left.data != Right.data)  return false;

        return isSymmetrichelp(Left.left , Right.right) && isSymmetrichelp(Left.right ,Right.left);
    }
}