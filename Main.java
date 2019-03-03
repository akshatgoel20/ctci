package com.starksky.ctci;

import com.starksky.ctci.LinkedList.*;
import sun.awt.image.ImageWatched;

public class Main {

    public static void main(String[] args) {
        // write your code here
       /* isUnique iu =  new isUnique();
        System.out.println(iu.isUnique("akshat"));
        System.out.println(iu.isUnique("tea"));*/

        /*checkPermutation cp = new checkPermutation();
        System.out.println(cp.checkPermutation("heloo", "oleh"));
        System.out.println(cp.checkPermutation("helo", "oleh"));*/

    /*    URLify urLify = new URLify();
        char[] chr = {'m', 'r',' ' ,'j', 'o', 'h', 'n', ' ','s','m','i', 't', 'h', ' ', ' ',' ',' ',' ',' ' ,' '};

        System.out.println(urLify.replaceSpaces(chr, 13));*/

        LinkedList list = new LinkedList();
        list.head = new LinkedList.Node(1);
        LinkedList.Node second = new LinkedList.Node(2);
        LinkedList.Node third = new LinkedList.Node(3);
        LinkedList.Node fourth = new LinkedList.Node(4);
        LinkedList.Node fifth = new LinkedList.Node(4);
        LinkedList.Node sixth = new LinkedList.Node(3);
        LinkedList.Node seventh = new LinkedList.Node(2);
        LinkedList.Node eight = new LinkedList.Node(1);
        list.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = eight;
        eight.next = null;
        System.out.print("Input: ");
       // list.printList();
        System.out.println();

       /* RemoveDups removeDups = new RemoveDups();
        removeDups.deleteDups(LinkedList.head);
        System.out.print("Output: ");
        list.printList();*/

       /* ReturnKthToLast returnKthToLast = new ReturnKthToLast();
        LinkedList.Node rK = returnKthToLast.returnKthToLast(LinkedList.head, 2);
        System.out.println(rK.data);*/

       /* LoopDetection loopDetection = new LoopDetection();
        loopDetection.loopDetection(LinkedList.head);*/

        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.Solution(LinkedList.head));

    }
}
