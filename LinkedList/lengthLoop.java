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
    private int findlen(ListNode slow , ListNode fast){
        int cnt=1;
        fast=fast.next;
        while(slow!=fast){
            cnt+=1;
            fast=fast.next;
        }
        return cnt;
    }
     public int findLengthOfLoop(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                return findlen(slow,fast);
            }
        }
        return 0;

     }
 }