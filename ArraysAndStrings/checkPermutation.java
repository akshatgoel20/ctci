package com.starksky.ctci.ArraysAndStrings;

public class checkPermutation {
    public boolean checkPermutation(String a, String b) {
        if (a.length() != b.length()) return false;
        char[] ca = new char[a.length()];
        char[] cb = new char[b.length()];

        int[] count = new int[128];

        for (char c : ca) {
            count[c]++;
        }

        for (int i = 0; i < cb.length; i++) {
            count[cb[i]]--;
            if (count[cb[i]] < 0) return false;
        }
        return true;
    }
}
