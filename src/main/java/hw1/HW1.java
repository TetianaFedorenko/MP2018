package hw1;

import java.util.Scanner;

/**
 * Created by Tetiana on 18-Dec-18.
 */

public class HW1 {
    public void resolveQuadraticEquationWithStaticVariables() {

        double a = 5;
        double b = -10;
        double c = -3;

        resolveQuadraticEquation(a, b, c);
    }

    public void resolveQuadraticEquationWithDynamicVariables() {

        double a, b, c;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numeric value a");
        checkIfValueIsNumeric(scanner);
        a = scanner.nextDouble();

        System.out.println("Enter numeric value b");
        checkIfValueIsNumeric(scanner);
        b = scanner.nextDouble();

        System.out.println("Enter numeric value c");
        checkIfValueIsNumeric(scanner);
        c = scanner.nextDouble();

        resolveQuadraticEquation(a, b, c);
    }

    private void resolveQuadraticEquation(double a, double b, double c) {

        double x1, x2;
        double d = Math.sqrt(b * b - 4 * a * c);
        if (d > 0){
            x1 = (-b + d) / (2 * a);
            x2 = (-b - d) / (2 * a);
            System.out.println("First equation root: x1 = " + x1);
            System.out.println("Second equation root: x2 = " + x2);
        } else if (d == 0) {
            x1 = -b / (2 * a);
            System.out.println("Equation root: x12 = " + x1);
        } else {
            System.out.println("There is no roots for this equation (discriminant < 0)");
        }
    }

    private void checkIfValueIsNumeric(Scanner scanner) {

        while (!scanner.hasNextDouble()) {
            System.out.println("It is not a number. Please try again");
            scanner.next();
        }
    }
}
