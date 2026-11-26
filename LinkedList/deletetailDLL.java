/*
// Definition for a Node.
class ListNode {
    public int data;
    public ListNode prev;
    public ListNode next;
    public ListNode();
    public ListNode(int data);
    public ListNode(int data, ListNode prev, ListNode next);
};
*/

class Solution {
    public ListNode deleteTail(ListNode head) {
        // Your code goes here
        if(head==null || head.next==null){
            return null;
        }
        ListNode tail=head;
        while(tail.next!=null){
            tail=tail.next;
            
        }
        ListNode newtail=tail.prev;
        newtail.next=null;
        tail.prev=null;
        return head;
    }
}
