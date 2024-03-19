package org.example;

public class Car extends Vehicle {
    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", rented=" + rented +
                ", rejstracja='" + rejstracja + '\'' +
                '}';
    }

    @Override
    String toCSV() {
        return "CAR;"+super.toCSV() + "\n";
    }
}
