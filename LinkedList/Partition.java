package com.starksky.ctci.LinkedList;

public class Partition {
    LinkedList.Node partition(LinkedList.Node node, int x) {
        LinkedList.Node head = node;
        LinkedList.Node tail = node;

        while(node != null){
            LinkedList.Node next = node.next;
            if(node.data < x){
                node.next = head;
                head = node;
            }else{
                tail.next = node;
                tail = node;
            }
            node = next;
        }
        tail.next = null;
        return head;
    }

}
