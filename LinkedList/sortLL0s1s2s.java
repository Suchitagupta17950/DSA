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
    public ListNode sortList(ListNode head) {
        //YOUR CODE GOES HERE
        ListNode temp=head;
        int cnt0=0;
        int cnt1=0;
        int cnt2=0;
        while(temp!=null){
        if(temp.data==0) cnt0++;
        else if(temp.data==1) cnt1++;
        else cnt2++;
        temp=temp.next;

        }
        temp=head;
        while(temp!=null){
            if(cnt0!=0){
                temp.data=0;
                cnt0--;

            }else if(cnt1!=0){
                temp.data=1;
                cnt1--;
            }else{
                temp.data=2;
                cnt2--;
            }
            temp=temp.next;
        }
        return head;

    }
}
