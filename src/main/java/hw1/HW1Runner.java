package hw1;

import hw1.HW1;

/**
 * Created by Tetiana on 18-Dec-18.
 */

public class HW1Runner {
    public static void main (String[] args) {
        HW1 hw1 = new HW1();
        System.out.println("Task 1: Resolve quadratic equation");
        hw1.resolveQuadraticEquationWithStaticVariables();
        System.out.println("\nTask 2: Resolve quadratic equation (enter parameters using console)");
        hw1.resolveQuadraticEquationWithDynamicVariables();
    }
}
