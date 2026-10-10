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
    public int diameterOfBinaryTree(TreeNode root) {
        //your code goes here
        int[] diameter=new int[1];
        height(root,diameter);
        

        return diameter[0];

    }
    private int height(TreeNode node,int[] diameter){
        int maxi=Integer.MIN_VALUE;
        if(node==null){
            return 0;
        }

        int lh=height(node.left,diameter);
        int rh=height(node.right,diameter);

        diameter[0]=Math.max(diameter[0],lh+rh);

        return 1+Math.max(lh,rh);

    }
}
