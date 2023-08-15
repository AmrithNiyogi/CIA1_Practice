package String_Numeric_Alphanumeric;

import java.util.Scanner;

public class NumericAlphanumericString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        NumericAlphanumericString numericAlphanumericString = new NumericAlphanumericString();
        System.out.println("Enter a string: ");
        String string = sc.next();

        if (numericAlphanumericString.isNumeric(string)) {
            System.out.println("String is numeric");
        }

        else if(numericAlphanumericString.isAlphaNumeric(string)) {
            System.out.println("String is AlphaNumeric");
        }

        else {
            System.out.println("String is neither numeric or alphanumeric");
        }


    }

    public static boolean isNumeric(String str) {
        return str.matches("^[0-9]*$");
    }

    public boolean isAlphaNumeric(String str) {
        return str.matches("^[a-zA-Z0-9]*$");
    }
}
