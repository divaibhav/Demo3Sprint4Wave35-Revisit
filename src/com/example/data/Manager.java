package com.example.data;

public class Manager extends Employee{
    private int teamSize;
    private int teamRating;

    public Manager(String name, int age, String dob, String address, double salary, int teamSize, int teamRating){
        // calling parent class constructor by using super keyword
        super(name, age, dob, address,salary);
        this.teamSize = teamSize;
        this.teamRating = teamRating;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public int getTeamRating() {
        return teamRating;
    }

    public void setTeamRating(int teamRating) {
        this.teamRating = teamRating;
    }
    public double calculateIncrement(){
        double increment = 0.0;
        if(teamRating > 8){
            increment = (getSalary() * 12.5)/100;
        }
        else{
            // use of super keyword to call parent call method
            increment = super.calculateIncrement();

        }
        return increment;
    }
}
