package com.dsa.java.yt.arrays;

/**
 * @author - ROHIT PARIDA
 */
public class ReverseAnArray {

  public static void main(String[] args) {

    int[] arr = {10, 50, 89, 46, 19, 32, 74};
    printArray(arr);
    int[] reversedArray = reverseArray(arr, 0, arr.length - 1);
    printArray(reversedArray);
  }

  /**
   * @param arr
   * @param start
   * @param end
   * @return
   */
  private static int[] reverseArray(int[] arr, int start, int end) {

    while (start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
    return arr;
  }

  /**
   * @param arr
   */
  private static void printArray(int[] arr) {

    for (int j : arr) {
      System.out.print(j + " ");
    }
    System.out.println();
  }
}
