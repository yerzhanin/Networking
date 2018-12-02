package com.epam.java;

import java.util.HashSet;
import java.util.Set;

public class Subordinate implements Employee {
    private String name;

    public Subordinate(String name) {
        this.name = name;
    }

    public void add(Subordinate subordinate){
    Set<Subordinate> subordinates = new HashSet<>();
        subordinates.add(subordinate);
    }

    @Override
    public void add(Employee employee) {
        employee.add(employee);
    }

    @Override
    public Employee getChild(int i) {
        return getChild(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("Sub first level="+getName());
    }

}
