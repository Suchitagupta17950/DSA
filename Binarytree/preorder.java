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
    public List<Integer> preorder(TreeNode root) {
        //your code goes here
        List<Integer>pre=new ArrayList<>();

        helper(root,pre);
        return pre;
    }
    private void helper(TreeNode root,List<Integer>pre){
        if(root==null) return;

        pre.add(root.data);
        helper(root.left,pre);
        helper(root.right,pre);
    }
}
