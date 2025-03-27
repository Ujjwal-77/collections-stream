package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTryCatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter the index of the element: ");
            int index = scanner.nextInt();

            try {
                int element = numbers[index];
                System.out.print("Enter the divisor: ");
                int divisor = scanner.nextInt();
                int result = element / divisor;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a number.");
        } finally {
            scanner.close();
        }
    }
}

