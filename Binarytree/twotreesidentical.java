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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //your code goes here
        if(p==null && q==null){
            return p==q;
        }
        if(p==null || q==null){
            return false;
        }
        return (p.data==q.data && isSameTree(p.left ,q.left) && isSameTree(p.right ,q.right));
    }
}