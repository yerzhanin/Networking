package com.epam.java;

public interface Employee {
    void add (Employee employee);
    Employee getChild (int i);
    String getName ();
    void print ();
}
