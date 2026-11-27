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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //YOUR CODE GOES HERE
        ListNode dummy =new ListNode(-1);
        ListNode curr=dummy;

        ListNode temp1=l1;
        ListNode temp2=l2;

        int carry=0;

        while(temp1!=null || temp2!=null){
            int sum=carry;
            if(temp1!=null) sum+=temp1.data;
            if(temp2!=null) sum+=temp2.data;

            ListNode newNode=new ListNode(sum%10);
            carry=sum/10;

            curr.next=newNode;
            curr=curr.next;

            if(temp1!=null) temp1=temp1.next;
            if(temp2!=null) temp2=temp2.next;

            
        }
        if(carry!=0){
            ListNode node=new ListNode(carry);
            curr.next=node;
        }
        return dummy.next;
    }
}