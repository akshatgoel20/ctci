package com.starksky.ctci.LinkedList;

import com.starksky.ctci.CtciLibrary.LinkedListNode;

public class Intersection {
    public int Solutions(LinkedListNode head1, LinkedListNode head2) {
        int d = 0;
        int c1 = getCount(head1);
        int c2 = getCount(head2);
        if (c1 > c2) {
            d = c1 - c2;
            return getIntersectionNode(d, head1, head2);
        } else {
            d = c2 - c1;
            return getIntersectionNode(d, head2, head1);
        }
    }

    private int getCount(LinkedListNode node) {
        LinkedListNode current = node;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    private int getIntersectionNode(int d, LinkedListNode node1, LinkedListNode node2) {
        LinkedListNode current1 = node1;
        LinkedListNode current2 = node2;
        for (int i = 0; i < d; i++) {
            if (current1 == null) return -1;
            current1 = current1.next;
        }

        while (current1 != null && current2 != null) {
            if (current1.data == current2.data) return current1.data;
            current1 = current1.next;
            current2 = current2.next;
        }
        return -1;
    }
}
