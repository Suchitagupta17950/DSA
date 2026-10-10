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
    public List<Integer> inorder(TreeNode root) {
        //your code goes here
        List<Integer> inord=new ArrayList<>();

        helper(root,inord);

        return inord;

    }
    private void helper(TreeNode root,List<Integer>inord){
        if(root==null) return;

        helper(root.left,inord);
        inord.add(root.data);
        helper(root.right,inord);
    }
}