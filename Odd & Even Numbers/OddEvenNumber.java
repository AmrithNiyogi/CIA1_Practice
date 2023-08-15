package OddEvenNumbers;

import java.util.Scanner;

public class OddEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            //prints 0 if even
            System.out.println(0);
        }

        else {
            //prints 1 if odd
            System.out.println(1);
        }
    }
}
