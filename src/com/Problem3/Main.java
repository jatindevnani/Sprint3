package com.Problem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creating a List of Employee objects
        List<Employee> employees = new ArrayList<>();

        //Taking the user input
        Scanner scanner = new Scanner(System.in);

        int count = 1;

        while(count <= 4) {
            try {
                System.out.println("Enter details of Employee " + count + ":");

                System.out.print("Enter Employee ID: ");
                int id = Integer.valueOf(scanner.next());

                System.out.print("Enter Employee Name: ");
                String name = scanner.next();

                System.out.print("Enter Employee Address: ");
                String address = scanner.next();

                System.out.print("Enter Employee Salary: ");
                double salary = Double.parseDouble(scanner.next());

                employees.add(new Employee(id, name, address, salary));
                count++;
                System.out.println();
            } catch (Exception e) {
                System.out.println();
                System.out.println("Please enter details in the correct format");
                System.out.println("Please re enter details of Employee " + count + "\n");
                continue;
            }
        }

        //Sorting the employees
        Collections.sort(employees);

        for(Employee emp: employees) {
            System.out.println(emp);
            System.out.println("___________________");
        }
    }
}
