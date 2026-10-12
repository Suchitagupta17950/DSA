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
    public List<Integer> rightSideView(TreeNode root) {
        //your code goes here
        List<Integer>result=new ArrayList<>();
        rightView(root,result,0);
        return result;
    }
    private void rightView(TreeNode node,List<Integer>result,int currdepth){
        if(node==null){
            return;
        }
        if(currdepth==result.size()){
            result.add(node.data);
        }
        rightView(node.right,result,currdepth+1);
        rightView(node.left,result,currdepth+1);
    }
}