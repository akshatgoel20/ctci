package com.starksky.ctci.LinkedList;

public class DeleteMiddleNode {
//given only access to any node than start and end.
    public void deleteMiddleNode(LinkedList.Node head){

        LinkedList.Node curr = head;

        curr.data = curr.next.data;
        curr.next  = curr.next.next;

    }

}
