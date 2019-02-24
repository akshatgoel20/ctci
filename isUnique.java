package com.starksky.ctci;

public class isUnique {
    public boolean isUnique(String str){
        char[] strArr = new char[26];
        for(int i = 0; i < str.length(); i++){
            strArr[str.charAt(i) - 'a']++;
            if(strArr[str.charAt(i) - 'a'] > 1){
                return false;
            }
        }
        return true;
    }
}
