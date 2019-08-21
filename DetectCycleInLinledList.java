/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    //boolean flag=false;
    boolean f=false;
    Node fastNode=head;
    Node slowNode=head;
    while(slowNode!=null && fastNode!=null &&  fastNode.next!=null){
        slowNode=slowNode.next;
        fastNode=fastNode.next.next;
        if(fastNode==slowNode){
           f=true;
            break;
        }
    }
    return f;
}
