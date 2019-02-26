package com.starksky.ctci.LinkedList;


import java.util.HashSet;


public class RemoveDups {

    public void deleteDups(LinkedList.Node head) {

        LinkedList.Node prev = head;
        LinkedList.Node curr = head;
        HashSet<Integer> set = new HashSet<>();
        while (curr != null) {
            if (!set.contains(curr.data)) {
                set.add(curr.data);
                prev = curr;
                curr = curr.next;
            } else {
                prev.next = curr.next;
                curr = prev.next;
            }
        }


    }
}
