package com.dsa.java.yt.arrays;

/**
 * @author - ROHIT PARIDA
 */
public class MoveZeroesToEndInArray {

  public static void main(String[] args) {

    int[] arr = {45, 0, 12, 36, 0, 98, 25, 0, 2};
    printArray(arr);
    int[] finalArray = moveZeroesToEnd(arr);
    printArray(finalArray); // Output - 45 12 36 98 25 2 0 0 0
  }

  /**
   *
   * @param arr
   * @return
   */
  private static int[] moveZeroesToEnd(int[] arr) {

    int j = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != 0 && arr[j] == 0) { // example: when arr[i] = 12 and arr[j] = 0 -> (i=2,j=1)
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
      if (arr[j] != 0) {
        j++;
      }
    }
    return arr;
  }

  /**
   *
   * @param arr
   */
  private static void printArray(int[] arr) {

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}
