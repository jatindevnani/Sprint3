package com.Problem3;

public class Employee implements Comparable<Employee>{

    int empId;
    String name;
    String address;
    double salary;

    @Override
    public String toString() {
        return "ID: " + empId + "\n" + "Name: " + name + "\n" + "Address: " + address + "\n" + "Salary: " + salary;
    }

    public Employee(int empId, String name, String address, double salary) {
        this.empId = empId;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        if(this.salary > o.salary) {
            return -1;
        } else if (this.salary < o.salary) {
            return 1;
        } else {
            return this.name.compareTo(o.name);
        }
    }
}
