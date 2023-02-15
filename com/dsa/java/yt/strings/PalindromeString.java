package com.dsa.java.yt.strings;

public class PalindromeString {

    public static void main(String[] args) {

        String s1 = "MALAYALAM"; // true
        String s2 = "AMERICA"; // false
        boolean flag = checkPalindrome(s1);
        System.out.println(flag);
    }

    private static boolean checkPalindrome(String s1) {

        int start = 0;
        int end = s1.length() - 1;
        boolean flag = false;

        while (start < end) {
            flag = s1.charAt(start) == s1.charAt(end);
            start++;
            end--;
        }
        return flag;
    }
}
