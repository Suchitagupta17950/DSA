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
    public List<Integer> postorder(TreeNode root) {
        //your code goes here
        List<Integer>post=new ArrayList<>();

        helper(root,post);
        return post;
    }
    private void helper(TreeNode root,List<Integer>post){
        if(root==null)  return;

        helper(root.left,post);
        helper(root.right,post);
        post.add(root.data);
    }
}
