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
    public ListNode insertBeforeX(ListNode head, int X, int val) {
        //YOUR CODE GOES HERE
        if(head==null){
            return new ListNode(val);
        }
        if(head.data==X){
            return new ListNode(val,head);
        }

        ListNode temp=head;
        ListNode prev=null;

        while(temp!=null){
            if(temp.data==X){
                ListNode newNode=new ListNode(val,temp);
                prev.next=newNode;
                break;

            }
            prev=temp;
            temp=temp.next;
        }
        return head;

    }
}
