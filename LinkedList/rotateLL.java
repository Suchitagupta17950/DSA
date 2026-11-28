/*Definition of singly linked list:
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
    private ListNode findNthnode(ListNode temp,int n){
        int cnt=1;
       
        while(temp!=null){
            if(cnt==n) return temp;
            cnt++;
            temp=temp.next;
        }
        return temp;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null ||head.next==null|| k==0){
            return head;
        }
        int len=1;
        ListNode tail=head;
        while(tail.next !=null){
            len++;
            tail=tail.next;
        }
        k=k%len;
        if(k==0){
            return head;
        }

        tail.next=head;
        
        
        ListNode newTail=findNthnode(head,len-k);
        ListNode newHead=newTail.next;
        newTail.next=null;
        return newHead;


    }
}