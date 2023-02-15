package com.dsa.java.yt.strings;

/**
 * @author - ROHIT PARIDA
 */
public class PalindromeString {

    public static void main(String[] args) {

        String s1 = "WGGL"; // false
        String s2 = "AMERICA"; // false
        String s3 = "MALAYALAM"; // true
        boolean flag = checkPalindrome(s3);
        System.out.println(flag);
    }

    /**
     *
     * @param s1
     * @return
     */
    private static boolean checkPalindrome(String s1) {

        boolean flag = s1.length() == 0 || s1.length() == 1;

        int start = 0;
        int end = s1.length() - 1;

        while (start < end) {
            flag = s1.charAt(start) == s1.charAt(end);
            if (!flag) {
                break;
            }
            start++;
            end--;
        }
        return flag;
    }
}
