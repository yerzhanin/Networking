package com.epam.java;
import java.util.*;

public class Manager implements Employee {
        private String name;
        List<Manager> subordinates;

    public Manager(String name){

        this.name = name;
    }

    ArrayList<Employee> employees = new ArrayList<>();
    public void add(Employee employee){
        employees.add(employee);
    }

    @Override
    public Employee getChild(int i) {
        return employees.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("Boss="+getName());

        Iterator<Employee> employeeIterator = employees.iterator();
        while (employeeIterator.hasNext()){
            Employee employee = employeeIterator.next();
            employee.print();
        }

    }

}
