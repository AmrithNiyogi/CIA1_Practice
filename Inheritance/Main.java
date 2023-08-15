package Inheritance;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Faculty> faculty = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of Faculty records to be entered: ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++ ){
            Faculty faculties = new Faculty();
            System.out.println("Enter Faculty Name: ");
            faculties.setName(sc.next());
            System.out.println("Enter Faculty ID: ");
            faculties.setId(sc.next());
            System.out.println("Enter Faculty Department: ");
            faculties.setDepartment(sc.next());
            System.out.println("Enter Faculty Salary: ");
            faculties.setSalary(sc.nextDouble());
            System.out.println("Enter Faculty Job Title: ");
            faculties.setJobTitle(sc.next());
            System.out.println("Enter Faculty Research Area: ");
            faculties.setResearchArea(sc.next());
            System.out.println("Enter Faculty Office Hours: ");
            faculties.setOfficeHours(sc.next());
            faculty.add(faculties);
        }

        for (Faculty faculties:faculty) {
            System.out.println("Name of Faculty: " + faculties.getName());
            System.out.println("ID of Faculty: " + faculties.getId());
            System.out.println("Department of Faculty: " + faculties.getDepartment());
            System.out.println("Salary of Faculty: " + faculties.getSalary());
            System.out.println("Job Title of Faculty: " + faculties.getJobTitle());
            System.out.println("Research Area of Faculty: " + faculties.getResearchArea());
            System.out.println("Office Hours of Faculty: " + faculties.getOfficeHours());
        }
    }
}
