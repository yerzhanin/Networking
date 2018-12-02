package com.epam.java;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Employee manager = new Manager("Big Boss");
        Subordinate sub1 = new Subordinate("BJ Penn");
        Subordinate sub2 = new Subordinate("Mark Hunt");
        manager.add(sub1);
        manager.add(sub2);

        manager.print();

    }
}
