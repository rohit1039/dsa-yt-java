package com.dsa.java.yt.arrays;

/**
 * @author - ROHIT PARIDA
 */
public class MinimumValueInArray {

  public static void main(String[] args) {

    int[] arr = {45, 89, 36, 74, 2, 100, 6};  //int[] arr = new int[0]; throws runtime exception
    int minVal = findMinimum(arr);
    printMinimum(minVal);
  }

  /**
   *
   * @param arr
   * @return
   */
  private static int findMinimum(int[] arr) {

    if (arr.length == 0) {
      throw new RuntimeException("Array is empty!");
    }
    int min = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    return min;
  }

  /**
   * @param k
   */
  private static void printMinimum(int k) {

    System.out.println(k);
  }
}
