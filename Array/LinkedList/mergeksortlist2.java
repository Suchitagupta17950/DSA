package LinkedList;

class Solution {
    
        
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode>pq=
            new PriorityQueue<>((a ,b)-> a.val - b.val);
        for(ListNode head:lists){
            if(head!=null){
            pq.offer(head);
            }

        }
        ListNode dummy =new ListNode(-1);
        ListNode tail=dummy;

        while(!pq.isEmpty()){
            ListNode node=pq.poll();
            tail.next=node;
            tail=tail.next;
            if(node.next!=null){
                pq.offer(node.next);
            }
        }
        return dummy.next;

    }
}
