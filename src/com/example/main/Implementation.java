package com.example.main;

import com.example.data.Manager;
import com.example.data.RegionalHead;

public class Implementation {
    public static void main(String[] args) {
        Manager manager1 = new Manager("vaibhav", 38, "10/10/90", "Bhopal", 50000, 5, 9);
        Manager manager2 = new Manager("Ramesh", 25, "20/10/2002", "Inodre", 65000, 4, 5);
        RegionalHead regionalHead1 = new RegionalHead("Akash", 20, "20/10/2007",
                "Pune", 70000, "Pune", 9, 8);
        RegionalHead regionalHead2 = new RegionalHead("Chetan", 55, "10/10/1978",
                "Agra", 90000, "Agra", 5, 5);

        System.out.println("manager1.calculateIncrement() = " + manager1.calculateIncrement());
        System.out.println("manager2.calculateIncrement() = " + manager2.calculateIncrement());
        System.out.println("regionalHead1.calculateIncrement() = " + regionalHead1.calculateIncrement());
        System.out.println("regionalHead2.calculateIncrement() = " + regionalHead2.calculateIncrement());

    }
}
