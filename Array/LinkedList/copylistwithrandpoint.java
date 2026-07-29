class Solution {
    public Node copyRandomList(Node head) {
        Node temp=head;
        while(temp!=null){
            Node copyNode=new Node(temp.val);
            copyNode.next=temp.next;
            temp.next=copyNode;
            temp=temp.next.next;
        }
        temp=head;
        while(temp!=null){
            Node copyNode=temp.next;
            copyNode.random=
                (temp.random!=null)? temp.random.next:null;
            temp=temp.next.next;

            
        }
        Node dnode=new Node(-1);
        Node res=dnode;
        temp=head;
        while(temp!=null){
            res.next=temp.next;
            temp.next=temp.next.next;
            res=res.next;
            temp=temp.next;
        }
        return dnode.next;
    }
}