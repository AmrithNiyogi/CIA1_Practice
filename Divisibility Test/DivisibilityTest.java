package DivisibilityTest;

import java.util.Scanner;

public class DivisibilityTest {

    public void divisibilityTest(long number){

        if ((number % 3 == 0) && (number % 5 == 0)) { //if (number % 15 == 0)
            System.out.println(number + " is divisible by 15");
        }

        if (number % 3 == 0) { //else if (number % 3 == 0)
            System.out.println(number + " is divisible by 3");
        }

        if (number % 5 == 0) { //else if (number % 5 == 0)
            System.out.println(number + " is divisible by 5");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DivisibilityTest divisibilityTest = new DivisibilityTest();

        System.out.println("Enter a number till where to check for divisibility of 3, 5 and 15: ");
        long number = sc.nextLong();

        for (int i = 1; i <= number; i++) {
            divisibilityTest.divisibilityTest(i);
        }
    }
}
