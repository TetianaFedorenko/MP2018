package hw2;

import java.util.Scanner;

/**
 * Created by Tetiana on 18-Dec-18.
 */
public class HW2Runner {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        HW2 hw2 = new HW2();
        System.out.println("Enter the task number (1-8)");
        int tn = scanner.nextInt();
        switch (tn) {
            case 1: System.out.println("Task 1: Write a Java program by loops to print the pattern");
                    hw2.printThePatternByLoop();
                    break;
            case 2: System.out.println("\nTask 2: Sort an integer array of 10 elements in ascending order (using the bubble sort algorithm)");
                    hw2.bubbleSortInAscendingOrder();
                    break;
            case 3: System.out.println("\nTask 3: Find if number belongs to the array using binary search algorithm\n");
                    hw2.findElementUsingBinarySearchAlgorithm();
                break;
            case 4: System.out.println("\nTask 4: Write a program which prints \"Odd Number\" if the int variable “number” is odd, " +
                    "or “Even Number” otherwise.\n");
                    hw2.checkOddEven();
                    break;
            case 5: System.out.println("\nTask 5: Write a program which prints \"ONE\", \"TWO\",... , \"NINE\", \"OTHER\" if " +
                    "the int variable \"number\" is 1, 2,... , 9, or other, respectively.");
                    hw2.printNumberInWord();
                    break;
            case 6: System.out.println("\nTask 6: Write a program to produce the sum of 1, 2, 3, ..., to 100. Also compute and display the average.");
                    hw2.sumAndAverage();
                    break;
            case 7: System.out.println("\nTask 7: Write a program called ComputePI to compute the value of π (compare it with Math.PI)");
                    hw2.computePI();
                    break;
            case 8: System.out.println("\nTask 8: Write a program called HarmonicSum to compute the sum of a harmonic series, as shown below, where n=50000");
                    hw2.harmonicSum();
                    break;
        }
    }
}
