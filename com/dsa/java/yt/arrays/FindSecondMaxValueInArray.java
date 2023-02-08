package com.dsa.java.yt.arrays;

/**
 * @author - ROHIT PARIDA
 */
public class FindSecondMaxValueInArray {

  public static void main(String[] args) {

    int[] arr = {13, 34, 33, 30, -5, -99, -3, 34, 2}; // second max is 33
    int secondMax = findSecondMax(arr);
    System.out.println(secondMax);
  }

  /**
   *
   * @param arr
   * @return
   */
  private static int findSecondMax(int[] arr) {

    int secondMax = Integer.MIN_VALUE;
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        secondMax = max; // before updating arr[i] to max, assign previous max to secondMax
        max = arr[i];
      }
      /* Condition to skip duplicates */
      else if (arr[i] != max && arr[i] > secondMax) {
        secondMax = arr[i];
      }
    }
    return secondMax;
  }
}
