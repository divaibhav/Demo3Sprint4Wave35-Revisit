package com.example.data;

public class Employee {
    private String name;
    private int age;
    private String dob;
    private String address;
    private double salary;

    public Employee(String name, int age, String dob, String address, double salary) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.address = address;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double calculateIncrement(){
        return (salary * 5.0)/100;
    }
}
