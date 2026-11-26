/*
// Definition for a Node.
class ListNode {
    public int data;
    public ListNode prev;
    public ListNode next;
    public ListNode();
    public ListNode(int data);
    public ListNode(int data, ListNode prev, ListNode next);
};
*/

class Solution {
    public ListNode arrayToDoublyLinkedList(List<Integer> arr) {
        // Your code goes here
        if(arr.size()==0){
            return null;
        }
        
        ListNode head=new ListNode(arr.get(0));
        ListNode curr=head;

        for(int i=1;i<arr.size();i++){
            ListNode newNode=new ListNode(arr.get(i));
            curr.next=newNode;
            newNode.prev=curr;
            curr=newNode;

        }
        return head;

    }
}