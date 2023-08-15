package Box_Pattern;

import java.util.Scanner;

public class PatternBox {

    public static void solidBox(int rows, int columns)
    {
        int i, j;
        for (i = 1; i <= rows; i++)
        {
            for (j = 1; j <= columns; j++)
                System.out.print("*");
            System.out.print("\n");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows for box: ");
        int m = sc.nextInt();
        System.out.println("Enter number of columns for box: ");
        int n = sc.nextInt();

        solidBox(m,n);
    }
}
