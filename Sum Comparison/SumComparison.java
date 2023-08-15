package SumComparison;

import java.util.Scanner;

public class SumComparison {
    public boolean sumComparison(int sum, int number3) {
        boolean isEqual = false;

        if (sum == number3) {
            isEqual = true;
        }

        return isEqual;
    }

    public static void main(String[] args) {

        SumComparison sumComparison = new SumComparison();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int number1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int number2 = sc.nextInt();
        System.out.println("Enter the third number: ");
        int number3 = sc.nextInt();

        int sum = number1 + number2;

        System.out.println("The sum of " + number1 + " + " + number2 + " is: " + sum + "\n " + number3
                + " and " + sum + " are equal - " + "True or False: "
                + sumComparison.sumComparison(sum, number3));
    }
}
