package hw2;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Tetiana on 18-Dec-18.
 */
public class HW2 {
    int[] arr = new int[10];
    int max = 10;
    int min = -10;

    // Task 1
    public void printThePatternByLoop() {
/*
1******
12*****
123****
1234***
12345**
123456*
1234567
*/
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j == i || j < i) {
                    System.out.print(j);
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }

    // Task 2
    public void bubbleSortInAscendingOrder() {

        generateIntegerArray(arr);
        System.out.println("int array before sorting: " + Arrays.toString(arr));
        sortArrayUsingBubbleSort(arr);
        System.out.println("int array after sorting: " + Arrays.toString(arr));
    }

    // Task 3
    public void findElementUsingBinarySearchAlgorithm() {
        int num = new Random().nextInt(max - min + 1) + min;
        bubbleSortInAscendingOrder();
        System.out.println("Number is: " + num);
        if (binarySearchAlgorithm(arr, num)) {
            System.out.println("Number " + num + " belongs to the array");
        } else {
            System.out.println("Number " + num + " doesn't belong to the array");
        }

    }

    private void generateIntegerArray(int[] arr) {

        for (int i = 0; i < 10; i++) {
            arr[i] = new Random().nextInt(max - min + 1) + min;
        }
    }

    private void sortArrayUsingBubbleSort(int[] arr) {
        int temp;

        for (int i = 0; i < 11; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    private boolean binarySearchAlgorithm(int[] arr, int num) {
        int leftBorder = 0;
        int rightBorder = arr.length-1;
        int searchKey = (rightBorder + leftBorder)/2;

        if (num >= arr[leftBorder] && num <= arr[rightBorder]) {
            while (arr[searchKey] != num && leftBorder <= rightBorder) {
                if (arr[searchKey] > num) {
                    rightBorder = searchKey - 1;
                } else {
                    leftBorder = searchKey + 1;
                }
                searchKey = (leftBorder + rightBorder) / 2;
            }
            if (leftBorder <= rightBorder) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
