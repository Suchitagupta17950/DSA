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
