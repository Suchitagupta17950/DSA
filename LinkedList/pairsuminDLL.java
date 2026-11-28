package LinkedList;

class Solution {
    public ArrayList<ArrayList<Integer>> givenSumPairs(Node head, int target) {
        // code here
        ArrayList<ArrayList<Integer>>res=new ArrayList<>();
        if(head==null) return res;
        
        Node left=head;
        Node right=head;
        while(right.next!=null) right=right.next;
        
        while(left!=null && right!=null && left!=right && right.next!=left){
            int sum=left.data+right.data;
            if(sum==target){
                ArrayList<Integer>pair=new ArrayList<>();
                pair.add(left.data);
                pair.add(right.data);
                res.add(pair);
                left=left.next;
                right=right.prev;
            }
            else if(sum<target) {
                left=left.next;
            }
            else{
                right=right.prev;
            }
        }
        return res;
        
    }
}

//brute approach

/*
class ListNode {
    int val;
    ListNode next;
    ListNode prev;
    
    ListNode(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}
*/

class Solution {
    public List<List<Integer>> findPairsWithGivenSum(ListNode head, int target) {
        // Your code goes here

        ListNode temp1=head;
        List<List<Integer>> ans=new ArrayList<>();

        while(temp1!=null){
            ListNode temp2=temp1.next;

            while(temp2!=null && temp1.val + temp2.val<=target){
                
                if(temp1.val+temp2.val==target){
                    List<Integer>ls=new ArrayList<>();
                    ls.add(temp1.val);
                    ls.add(temp2.val);
                    ans.add(ls);
                    

                }
                
                temp2=temp2.next;

            }
            temp1=temp1.next;
        }
        return ans;
    }
}
