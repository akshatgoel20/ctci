package com.starksky.ctci.LinkedList;

import java.util.Stack;

public class Palindrome {

    public boolean Solution(LinkedList.Node head) {
        LinkedList.Node slow = head;
        LinkedList.Node fast = head;
        Stack<LinkedList.Node> stack = new Stack<>();
        while(fast != null  && fast.next != null){
            stack.push(slow);
            slow = slow.next;
            fast = fast.next.next;
        }

        while(fast != null){
            slow = slow.next;
        }

        while(slow != null){
            if(slow.data != stack.pop().data) return false;
            slow =  slow.next;
        }
        return true;
    }

}
