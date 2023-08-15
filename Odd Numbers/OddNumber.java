package OddNumbers;

import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Odd Numbers from 1 to 100: ");
        for (int i = 1; i < 100; i+=2) {
            System.out.println(i);
        }

        System.out.println("Odd Numbers from 1 to 100: ");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
