package com.example.data;

public class RegionalHead extends Employee{
    private String regionName;
    private int regionPerformance;
    private int reviewRating;

    public RegionalHead(String name, int age, String dob, String address, double salary, String regionName, int regionPerformance, int reviewRating) {
        super(name, age, dob, address, salary);
        this.regionName = regionName;
        this.regionPerformance = regionPerformance;
        this.reviewRating = reviewRating;
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

    public int getReviewRating() {
        return reviewRating;
    }

    public void setReviewRating(int reviewRating) {
        this.reviewRating = reviewRating;
    }

    public double calculateIncrement() {
        double response = 0.0;
        if (regionPerformance > 8 && reviewRating > 7) {
            response = (getSalary() * 10.5) / 100;
        } else {
            response = super.calculateIncrement();
        }

        return response;
    }
}
