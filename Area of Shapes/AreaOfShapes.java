package Shape_Area;

import java.util.Scanner;

public class AreaOfShape {

    public final double pi = 3.14;

    public float area(float side) {
        //area of a square
        return (float)Math.pow(side,2);
    }

    public float area(float length, float breadth) {
        //area of a rectangle
        return (length*breadth);
    }

    public double area(double radius) {
        //area of a circle
        return (float) (pi*Math.pow(radius,2));
    }

    public double area(double side1, double side2, double side3) {
        //area of triangle using herons formula
        double semiperimeter = (side1 + side2 + side3) / 2;
        return Math.sqrt(semiperimeter *(semiperimeter -side1)*(semiperimeter -side2)*(semiperimeter -side3));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float side, length, breadth;
        double side1, side2, side3, radius;

        boolean isTrue = true;

        AreaOfShape areaOfShape = new AreaOfShape();

        while (isTrue) {

            System.out.println("Main Menu");
            System.out.println("1. Area of Square");
            System.out.println("2. Area of Rectangle");
            System.out.println("3. Area of Circle");
            System.out.println("4. Area of Triangle");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();


            switch (choice) {

                case 1:
                    System.out.println("Enter side of square: ");
                    side = sc.nextFloat();
                    System.out.println("Area of Square is: " + areaOfShape.area(side));

                case 2:
                    System.out.println("Enter length of rectangle: ");
                    length = sc.nextFloat();
                    System.out.println("Enter breadth of rectangle: ");
                    breadth = sc.nextFloat();
                    System.out.println("Area of Rectangle is: " + areaOfShape.area(length, breadth));

                case 3:
                    System.out.println("Enter radius of circle: ");
                    radius = sc.nextDouble();
                    System.out.println("Area of Circle is: " + areaOfShape.area(radius));

                case 4:
                    System.out.println("Enter 1st side of triangle: ");
                    side1 = sc.nextDouble();
                    System.out.println("Enter 2nd side of triangle: ");
                    side2 = sc.nextDouble();
                    System.out.println("Enter 3rd side of triangle: ");
                    side3 = sc.nextDouble();
                    System.out.println("Area of Triangle is: " + areaOfShape.area(side1, side2, side3));

                case 5:
                    isTrue = false;

                default:
                    System.out.println("Invalid Option");
            }
        }

    }
}
