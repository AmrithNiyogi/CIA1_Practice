package StringToInteger;

import java.util.Scanner;

public class StringToInteger {

    public void stringConversion(String str) {
        try {
            int i;
            i = Integer.parseInt(str);
            System.out.println("Successfully converted " + str + " to integer: " + i);
        }
        catch (NumberFormatException e) {
            System.out.println("Exception Caught! \nCannot convert String Values to Integer");
            System.out.println("Cause: " + e.getCause());
        }
    }

    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        StringToInteger stringToInteger = new StringToInteger();

        System.out.println("Enter a string: ");
        String string = sc.next();

        stringToInteger.stringConversion(string);
    }
}
