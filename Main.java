package com.starksky.ctci;

import com.starksky.ctci.ArraysAndStrings.URLify;
import com.starksky.ctci.ArraysAndStrings.checkPermutation;
import com.starksky.ctci.ArraysAndStrings.isUnique;

public class Main {

    public static void main(String[] args) {
        // write your code here
       /* isUnique iu =  new isUnique();
        System.out.println(iu.isUnique("akshat"));
        System.out.println(iu.isUnique("tea"));*/

        /*checkPermutation cp = new checkPermutation();
        System.out.println(cp.checkPermutation("heloo", "oleh"));
        System.out.println(cp.checkPermutation("helo", "oleh"));*/

        URLify urLify = new URLify();
        char[] chr = {'m', 'r',' ' ,'j', 'o', 'h', 'n', ' ','s','m','i', 't', 'h', ' ', ' ',' ',' ',' ',' ' ,' '};

        System.out.println(urLify.replaceSpaces(chr, 13));
    }
}
