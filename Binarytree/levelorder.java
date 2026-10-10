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
    public List<List<Integer>> levelOrder(TreeNode root) {
        //your code goes here
        List<List<Integer>>wraplist=new LinkedList<>();
        Queue<TreeNode>queue=new LinkedList<>();

        if(root==null)  {
            return wraplist;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelnum=queue.size();

            List<Integer>sublist=new ArrayList<>();
            for(int i=0;i<levelnum;i++){
                TreeNode curr=queue.poll();
                sublist.add(curr.data);
                if(curr.left!=null){
                    queue.offer(curr.left);
                }
                if(curr.right!=null){
                    queue.offer(curr.right);
                }
               
            }
            wraplist.add(sublist);
        }
        return wraplist;
    }
}
