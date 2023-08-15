package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListStudents {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students records to be inputted: ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            Student student = new Student();

            System.out.println("Enter Details of student " + (i+1));
            System.out.println("Enter the Name of Student: ");
            student.setName(sc.next());
            System.out.println("Enter the ID of Student: ");
            student.setId(sc.next());
            System.out.println("Enter the Age of Student(in years): ");
            student.setAge(sc.nextInt());

            students.add(student);
        }

//        for (Student student: students) {
//            System.out.println("Details of Students: ");
//            System.out.println("Name: " + student.getName());
//            System.out.println("ID: " + student.getId());
//            System.out.println("Age: " + student.getAge());
//        }

        System.out.println("Enter the age for which students should be checked: ");
        int age = sc.nextInt();

        for (Student student: students) {
            if (student.getAge() < age){
                System.out.println("Details of Students under the age of " + age +": ");
                System.out.println("Name: " + student.getName());
                System.out.println("ID: " + student.getId());
                System.out.println("Age: " + student.getAge());
            }
        }
    }
}
