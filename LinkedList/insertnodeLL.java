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
    public ListNode insertBeforeHead(ListNode head, int data) {
        // Your code goes here
        if(head==null){
            return new ListNode(data);
        }
        ListNode newNode=new ListNode(data,null,head);
        head.prev=newNode;
        head=newNode;
        return head;
    }
}