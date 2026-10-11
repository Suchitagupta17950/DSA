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
    public int maxPathSum(TreeNode root) {
        //your code goes here 
        int[] maxi=new int[1];
        maxi[0]=Integer.MIN_VALUE;

        maxdownPath(root,maxi);
        return maxi[0];

    }
    private int maxdownPath(TreeNode node,int[] maxi){
        if(node==null){
            return 0;
        }
        int leftpath=Math.max(0,maxdownPath(node.left,maxi));
        int rightpath=Math.max(0,maxdownPath(node.right,maxi));

        maxi[0]=Math.max(maxi[0],(leftpath+rightpath+node.data));

        return node.data + Math.max(leftpath,rightpath);
    }

}