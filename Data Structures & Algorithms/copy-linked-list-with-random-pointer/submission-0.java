/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
           if(head==null){
            return null;
        }
        Map<Node,Node> clone=new HashMap<>();
        Node firstPass=head;
        while (firstPass!=null){
            Node cpyNode =new Node(firstPass.val);
            clone.put(firstPass,cpyNode);
            firstPass=firstPass.next;



        }
        Node secPass=head;
        while (secPass!=null){
            clone.get(secPass).next=clone.get(secPass.next);
            clone.get(secPass).random=clone.get(secPass.random);
            secPass=secPass.next;
        }
        return clone.get(head);
    }
}
