
/*Definition for Singly Linked List
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }

        int cnt=0;
        ListNode temp=head;

        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        if(cnt==n){
            head=head.next;
            return head;
        }
        temp=head;

        int res=cnt-n;
        while(temp!=null){
            res--;
            if(res==0) break;
            temp=temp.next;
        }
        
        temp.next=temp.next.next;

        return head;

    }
}
