package com.starksky.ctci.LinkedList;

public class ReturnKthToLast {

    public LinkedList.Node returnKthToLast(LinkedList.Node head, int k){
        LinkedList.Node prev = head;
        LinkedList.Node curr = head;
        int count  = 0;
        while(curr != null){
            if(count >= k){
                prev = prev.next;
            }
            curr = curr.next;
            count++;
        }
        return prev;
    }
}
