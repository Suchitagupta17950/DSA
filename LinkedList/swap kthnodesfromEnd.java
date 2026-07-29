package LinkedList;

class Solution {
    public Node swapKth(Node head, int k) {
        // code here
        int n=0;
        Node curr=head;
        while(curr!=null){
            curr=curr.next;
            n++;
        }
        if(k>n){
            return head;
        }
        int a=n-k;
        int b=k-1;
        int t=0;
        curr=head;
        Node p1=null,p2=null;
        while(curr!=null){
            if(t==a||t==b){
                if(p1==null){
                    p1=curr;
                }
                else{
                    p2=curr;
                }
            }
            curr=curr.next;
            t++;
        }
        if(p1!=null && p2!=null){
            t=p1.data;
            p1.data=p2.data;
            p2.data=t;
        }
        return head;
    }
}
