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
    public ListNode deleteKthNode(ListNode head, int k) {
        // Your code goes here
        if(head==null) return head;

        
        if(k==1){
            head=head.next;
            return head;
        }
        ListNode temp=head;
        ListNode prev=null;
        int cnt=0;

        while(temp!=null){
            cnt++;
            if(cnt==k){
                prev.next=prev.next.next;
                break;

            }
            prev=temp;
            temp=temp.next;
        }
        return head;


    }
}
