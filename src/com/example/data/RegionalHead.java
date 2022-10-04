package com.example.data;

public class RegionalHead extends Employee{
    private String regionName;
    private int regionPerformance;
    private int regionRating;

    public RegionalHead(String name, int age, String dob, String address, double salary, String regionName, int regionPerformance, int regionRating) {
        super(name, age, dob, address, salary);
        this.regionName = regionName;
        this.regionPerformance = regionPerformance;
        this.regionRating = regionRating;
    }
}
