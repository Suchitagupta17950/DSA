package LinkedList;

class Solution {
    private ListNode getKthnode(ListNode temp,int k){
        k-=1;
        while(temp!=null && k>0){
            k--;
            temp=temp.next;

        }
        return temp;
        
    }
    private ListNode reverse(ListNode head){
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;

        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode prevNode=null;
        ListNode nextNode=null;
        while(temp!=null){
            ListNode kthNode=getKthnode(temp,k);
            if(kthNode==null){
                prevNode.next=temp;
                break;

            }
            nextNode=kthNode.next;
            kthNode.next=null;
            reverse(temp);
            if(temp==head){
                head=kthNode;
            }
            else{
                prevNode.next=kthNode;
            }
            prevNode=temp;
            temp=nextNode;
            
        }
        return head;
    }
}
