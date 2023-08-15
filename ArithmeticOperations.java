package Arithmetic_Operations;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class ArithmeticOperations {

    public int addNumbers(int a, int b) {
        return a+b;
    }

    public int subtractNumbers(int a, int b) {
        return a-b;
    }

    public int multiplyNumbers(int a, int b) {
        return a*b;
    }

    public float divideNumbers(float a, float b) {
        return a/b;
    }

    public int remainder(int a, int b) {
        return a%b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArithmeticOperations arithmeticOperations = new ArithmeticOperations();

        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        while (true) {

            System.out.println("Main Menu");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Remainder");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Sum is: " + arithmeticOperations.addNumbers(a,b));
                    break;

                case 2:
                    System.out.println("Difference is: " + arithmeticOperations.subtractNumbers(a,b));
                    break;

                case 3:
                    System.out.println("Product is: " + arithmeticOperations.multiplyNumbers(a,b));
                    break;

                case 4:
                    System.out.println("Quotient is: " + arithmeticOperations.divideNumbers(a,b));
                    break;

                case 5:
                    System.out.println("Remainder is: " + arithmeticOperations.remainder(a,b));

                case 6:
                    System.exit(0);

                default:
                    System.out.println("Wrong Input!!");
            }

        }

    }
}
