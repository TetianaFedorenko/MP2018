package hw2;

/**
 * Created by Tetiana on 18-Dec-18.
 */
public class HW2Runner {
    public static void main(String []args) {
        HW2 hw2 = new HW2();
        System.out.println("Task 1: Write a Java program by loops to print the pattern");
        hw2.printThePatternByLoop();
        System.out.println("\nTask 2: Sort an integer array of 10 elements in ascending order (using the bubble sort algorithm)");
        hw2.bubbleSortInAscendingOrder();
        System.out.println("\nTask 3: Find if number belongs to the array using binary search algorithm\n");
        hw2.findElementUsingBinarySearchAlgorithm();
    }
}
