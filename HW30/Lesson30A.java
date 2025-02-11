package HW30;
//Ryan Jukes
//2-10-25
//AT Java HW 30 Part A

import java.util.ArrayList;
import java.util.Scanner;

public class Lesson30A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        while (true) {
            System.out.print("Enter a letter ((E)mployee, (M)anager, or (Q)uit): ");
            String choice = in.nextLine().toLowerCase();
            String name;
            double salary;
            double bonus;
            if (choice.equals("q")) {
                break;
            } else if (choice.equals("e")) {
                System.out.print("Enter name: ");
                name = in.nextLine();
                System.out.print("Enter salary (as a double): ");
                salary = Double.parseDouble(in.nextLine());
                Employee employee = new Employee(name, salary);
                employees.add(employee);
            } else if (choice.equals("m")) {
                System.out.print("Enter name: ");
                name = in.nextLine();
                System.out.print("Enter salary (as a double): ");
                salary = Double.parseDouble(in.nextLine());
                System.out.print("Enter bonus (as a double): ");
                bonus = Double.parseDouble(in.nextLine());
                Manager manager = new Manager(name, salary, bonus);
                employees.add(manager);
            } else {
                System.out.println("I don't understand your choice.");
            }
            System.out.println();
        }

        System.out.println();

        System.out.printf("Your company has %d employees.%n", employees.size());
        System.out.println();

        for (Employee employee : employees) {
            employee.displayInfo();
            System.out.println();
        }
    }
}