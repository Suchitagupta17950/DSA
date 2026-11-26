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
    public ListNode insertAtTail(ListNode head, int X) {
        //YOUR CODE GOES HERE
        if(head==null){
            return new ListNode(X);

        }
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        ListNode newTail=new ListNode(X);
        temp.next=newTail;

        return head;
    }
}
