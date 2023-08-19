package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapEmployee {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        HashMap<String, Employee> employeeHashMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of employee records to be entered: ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            Employee employee = new Employee();

            System.out.println("Enter details of Employee " + (i+1));
            System.out.println("Enter Name of Employee: ");
            employee.setName(sc.next());
            System.out.println("Enter ID of Employee: ");
            employee.setId(sc.next());
            System.out.println("Enter Age of Employee: ");
            employee.setAge(sc.nextInt());

            employees.add(employee);
        }

//        for (Employee employee: employees) {
//            System.out.println("Details of Employees");
//            System.out.println("Name: " + employee.getName());
//            System.out.println("ID: " + employee.getId());
//            System.out.println("Age: " + employee.getAge());
//        }

        System.out.println("Enter Employee Id to search: ");
        String searchId = sc.next();

        for (Employee employee: employees) {
            employeeHashMap.put(employee.getId(), employee);
        }

        Employee employee = employeeHashMap.get(searchId);

        if (employee != null) {
            System.out.println("Details of Employees");
            System.out.println("Name: " + employee.getName());
            System.out.println("ID: " + employee.getId());
            System.out.println("Age: " + employee.getAge());
        }

        else {
            System.out.println("ID Not Found");
        }
    }
}
