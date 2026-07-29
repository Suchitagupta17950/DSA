class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int cnt=0;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        if(cnt==n){
            ListNode newHead=head.next;
            return newHead;
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