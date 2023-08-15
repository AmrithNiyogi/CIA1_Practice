package PrintNumbers;

import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number till where you to print digits: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.print(i + " ");
        }
    }
}
