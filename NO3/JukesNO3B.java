package NO3;
/*
Ryan Jukes
4-15-25
NO3 
*/

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class JukesNO3B {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<Employee>();
        double salary = 0;
        Employee.lastIDUsed = 0;
        while (true) {
            System.out.print("Enter e to add employee or q to quit: ");
            if (in.hasNext("Q") || in.hasNext("q")) {
                in.nextLine();
                System.out.println("Done inputting data.");
                break;
            } else {
                in.nextLine();
                System.out.print("Enter first name: ");
                String firstname = in.nextLine();
                System.out.print("Enter last name: ");
                String lastname = in.nextLine();
                System.out.print("Enter salary: ");
                String token = in.nextLine();
                try {
                    salary = Double.parseDouble(token);
                } catch (InputMismatchException e) {
                    System.err.println("  Error parsing salary.");
                    System.err.println("  Using $0 as default salary.");
                }
                Employee.lastIDUsed++;
                Employee newEmployee = new Employee(firstname, lastname, Employee.lastIDUsed, salary);
                employees.add(newEmployee);
            }
        }

        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i).getFirstName());
        }

        String filepath = "data.bin";

        try (
                FileOutputStream fileOutputStream = new FileOutputStream(filepath);
                DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream)) {
            dataOutputStream.writeInt(Employee.lastIDUsed);
            for (Employee newEmployee : employees) {
                newEmployee.writeToStream(dataOutputStream);
            }
            System.out.println("Data saved to \"" + filepath + "\"");
        } catch (IOException e) {
            System.err.println("Error writing to output file.");
            System.err.println(e.getMessage());
        } 
    }
}
