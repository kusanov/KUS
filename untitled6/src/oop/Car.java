package oop;

public class Car {
    private int year;

    public Car(int year, int year2){
        this.year = year;
    }


    public Car(int year){
        this.year = year;
    }

    public Car(){

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
