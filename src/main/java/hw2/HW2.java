package hw2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Tetiana on 18-Dec-18.
 */
public class HW2 {

    Scanner scanner = new Scanner(System.in);

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

    /*Task 4: Write a program called CheckOddEven which prints "Odd Number" if the int variable “number” is odd,
    or “Even Number” otherwise.*/
    public void checkOddEven() {
        System.out.println("Please enter some number");
        double a = scanner.nextDouble();
        if (a%2 == 0 && a != 0){
            System.out.println("Even Number");
        } else if (a%2 != 0) {
            System.out.println("Odd Number");
        } else if (a == 0) {
            System.out.println("You entered zero. Try again");
            scanner.next();
        }
    }

    /*Task 5: Write a program called PrintNumberInWord which prints "ONE", "TWO",... , "NINE", "OTHER" if
    the int variable "number" is 1, 2,... , 9, or other, respectively.*/
    public void printNumberInWord() {
        System.out.println("Please enter some number");
        int a = scanner.nextInt();
        switch (a) {
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }

    /*Task6: Write a program called SumAndAverage to produce the sum of 1, 2, 3, ..., to 100. Also compute and display the average.*/

    public void sumAndAverage() {
        int i;
        int sum = 0;
        for (i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Sum is: " + sum);
        System.out.println("Avarage is: " + sum/2);
    }

    /*Task7: Write a program called ComputePI to compute the value of π (compare it with Math.PI)*/
    public void computePI() {
        double p, c, d;
        System.out.println("Enter length");
        c = scanner.nextDouble();
        System.out.println("Enter diameter");
        d = scanner.nextDouble();
        p = c/d;
        System.out.println("PI is: " + p);
        System.out.println("PI is: " + Math.PI);
    }

    /*Task8: Write a program called HarmonicSum to compute the sum of a harmonic series, as shown below, where n=50000*/
    public void harmonicSum() {
        int harmonic = 50000;
        int i = 1;
        double sum = 0;
        while (i <= harmonic) {
            sum = sum + (1/(double)i);
            i++;
        }
        System.out.println("Result is: " + sum);
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
