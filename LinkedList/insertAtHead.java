/*
Definition of singly linked list:
class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}
*/

class Solution {
    public ListNode insertAtHead(ListNode head, int X) {
        //YOUR CODE GOES HERE
        if(head==null || head.next==null){
            return new ListNode(X,head);
        }
        ListNode newHead=new ListNode(X,head);
        return newHead;
    }
}
