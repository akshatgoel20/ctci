package com.starksky.ctci.LinkedList;

public class LinkedList {

    public static Node head;

    public static class Node {
        public int data;
        public Node next;

        public Node(int d) {
            data = d;
            next = null;
        } // Constructor
    }

    /**
     * Print a Link List
     */
    public static void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
}
