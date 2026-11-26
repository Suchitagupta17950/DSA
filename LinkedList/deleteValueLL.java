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
    public ListNode deleteNodeWithValueX(ListNode head, int X) {
        //YOUR CODE GOES HERE
        if(head==null){
            return head;
        }
        if(head.data==X){
            head=head.next;
            return head;
        }
        ListNode temp=head;
        ListNode prev=null;

        while(temp!=null){
            if(temp.data==X){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
}
