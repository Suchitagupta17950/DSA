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
    public ListNode insertBeforeTail(ListNode head, int X) {
        // Your code goes here
       
        if(head.next ==null){
            return insertBeforeHead(head,X);
        }
        ListNode tail=head;
        while(tail.next!=null){
            tail=tail.next;
        }
        ListNode prevtail=tail.prev;
        ListNode newNode=new ListNode(X,prevtail,tail);
        tail.prev=newNode;
        prevtail.next=newNode;

        return head;
    }
}
