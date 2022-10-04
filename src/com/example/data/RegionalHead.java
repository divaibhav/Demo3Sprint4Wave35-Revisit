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

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public int getRegionPerformance() {
        return regionPerformance;
    }

    public void setRegionPerformance(int regionPerformance) {
        this.regionPerformance = regionPerformance;
    }

    public int getRegionRating() {
        return regionRating;
    }

    public void setRegionRating(int regionRating) {
        this.regionRating = regionRating;
    }
    public double calculateIncrement(){
        double response = 0.0;


        return response;
    }
}
