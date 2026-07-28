package LinkedList;

class Solution {
   
    public int lengthOfLoop(Node head) {
        // code here
        HashMap<Node,Integer>mp=new HashMap<>();
        Node temp=head;
        int pos=0;
        
        while(temp!=null){
            if(mp.containsKey(temp)){
                return pos-mp.get(temp);
            }
            mp.put(temp,pos);
            pos+=1;
            temp=temp.next;
        }
        return 0;
    }
}