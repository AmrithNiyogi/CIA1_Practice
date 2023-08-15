package Unique_String;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();

        HashSet<String> set = new HashSet<>();

        System.out.println("Enter " + n + " strings:");
        for(int i=0; i<n; i++) {
            set.add(sc.next());
        }

        System.out.println("Unique Strings:");
        for(String str : set) {
            System.out.println(str);
        }
    }
}
