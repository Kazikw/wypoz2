package org.example;

abstract class Vehicle {
    String brand;
    String model;
    int year;
    int price;
    boolean rented;
    String rejstracja;
    String toCSV(){
        //return brand + ";" + model + ";" + year + ";" + price + ";" + rejstracja;
        return brand + ";" + model + ";" + year + ";" + price + ";" + rejstracja + ";" + rented;

    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", rented=" + rented +
                ", rejstracja='" + rejstracja + '\'' +
                '}';
    }
}
