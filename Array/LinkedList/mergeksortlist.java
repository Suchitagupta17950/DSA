package LinkedList;

class Solution {
    private ListNode merge2Lists(ListNode lists1, ListNode lists2){
        ListNode dummyNode=new ListNode(-1);
        ListNode res=dummyNode;
        while(lists1!=null && lists2!=null){
            if(lists1.val<lists2.val){
                res.next=lists1;
                res=lists1;
                lists1=lists1.next;
            }
            else{
                res.next=lists2;
                res=lists2;
                lists2=lists2.next;
            }
            res=res.next;
        }
        if(lists1!=null) res.next=lists1;
        else res.next=lists2;

        return dummyNode.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0)
            return null;
        ListNode head=lists[0];
        for(int i=0;i<lists.length;i++){
            head=merge2Lists(head,lists[i]);
        }
        return head;
    }
}