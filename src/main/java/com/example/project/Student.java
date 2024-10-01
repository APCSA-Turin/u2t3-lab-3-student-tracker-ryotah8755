package com.example.project;

public class Student {
    // instance variables for 
    // first name (String)
    private String firstName;
    private String lastName;
    private int gradYear;
    private double sumTestScore;
    private double testScoreCount;
    private double highestTestScore;
    private double averageTestScore;
    // last name (String)
    // graduation year (int)
    // sum of test scores (double).. should initialize at 0.0
    // test score count (int) ..should initialize at 0
    // highest test score (double).. should initialize at 0.0
 
    // constructor
    public Student(String firstName, String lastName, int gradYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradYear = gradYear;
        sumTestScore = 0.0;
        testScoreCount = 0.0;
        highestTestScore = 0.0;
        averageTestScore = 0.0;

    }
 
    // returns firstName
    public String getFirstName() {
        return firstName;
    }
 
    // returns lastName
    public String getLastName() {
        return lastName;
    }
 
    public double getHighestTestScore() {
        return highestTestScore;
    }

    public double getTestScoreCount(){
        return testScoreCount;
    }

    public int getGradYear(){
        return gradYear;
    }
 
    // sets gradYear to newGradYear
    public void setGradYear(int setGradYear) {
        gradYear = setGradYear;
    }
 
    // adds newTestScore to accumulatedTestScores
    // and increments testScoreCount by 1
    // set new highest test score 
    public void addTestScore(double newTestScore) {
        testScoreCount = testScoreCount + 1.0 ;
        sumTestScore = sumTestScore + newTestScore;
    }
 
    // returns true if the student's average test score is greater
    // than or equal to 65; returns false otherwise (see Note 2 below)
    public boolean isPassing() {
        if(averageTestScore >= 65.0){
            return true;
        }
        else{
            return false;
        }
        
    }
 
    // returns the Student's average test score as the
    // quotient of accumulatedTestScores and testScoreCount
    public double averageTestScore() {
        averageTestScore = (double) sumTestScore/testScoreCount;
        return averageTestScore;
    }
 
    // this method prints all info of a Student object to the console 
    // I AM NOT TESTING YOU ON THIS METHOD. IT'S FOR YOUR TESTING PURPOSES ONLY.. you don't have to use it
    public void printStudentInfo() {
        System.out.println("Student Full Name: " );
        System.out.println("Graduation Year: ");
        System.out.println("Number of tests: ");
        System.out.println("Average Test Score: ");
        System.out.println("Highest Test Score: ");
        System.out.println("Is passing: ");
    }
 }
 