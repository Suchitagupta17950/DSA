package LinkedList;

class Solution {
    private int detectLL(Node head){
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) {
                int cnt=1;
                fast=fast.next;
                while(slow!=fast){
                    cnt++;
                    fast=fast.next;
                }
            
            return cnt;
            }
        }
        return 0;
    }
    public int lengthOfLoop(Node head) {
        // code here
        return detectLL(head);
        
    }
}
