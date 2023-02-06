package com.dsa.java.yt.arrays;

import java.util.Scanner;

/**
 * Remove even elements from an array
 *
 * @Input - {11, 45, 26, 31, 48}
 *
 * @Output - {11, 45, 31}
 */
public class RemoveEvenElementsFromArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int oddCount = oddCount(arr);
        int[] finalArray = arrayWithOddElements(arr, oddCount);
        printArray(finalArray);
    }

    private static int[] arrayWithOddElements(int[] arr, int oddCount) {

        int[] onlyOddElements = new int[oddCount];

        int index = 0; // extra index to traverse as the length of arr and OnlyOddElements is different

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                onlyOddElements[index] = arr[i]; // assign element to the resultant array if element is odd
                index++;
            }
        }
        return onlyOddElements;
    }

    /**
     * @param arr
     * @return count the odd elements, so that no extra space is allocated!
     */
    private static int oddCount(int[] arr) {

        int count = 0;

        for (int j : arr) {
            if (j % 2 != 0) {
                count++;
            }
        }
        return count;
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
