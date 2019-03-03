package com.starksky.ctci.LinkedList;

public class LoopDetection {
    public void loopDetection(LinkedList.Node head){
        LinkedList.Node t = head.next;
        LinkedList.Node h = head.next.next;
        while(t.data != h.data){
            t = t.next;
            h = h.next.next;
        }

         h = head;

        while(t.data != h.data){
        t = t.next;
        h = h.next;
        }

        System.out.println(t.data);

    }
}
