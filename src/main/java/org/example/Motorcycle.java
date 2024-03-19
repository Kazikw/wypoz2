package org.example;

public class Motorcycle extends Vehicle {
    String kategoria;

    @Override
    public String toString() {
        return "Motorcycle{" +
                "kategoria='" + kategoria + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", rented=" + rented +
                ", rejstracja='" + rejstracja + '\'' +
                '}';
    }

    @Override
    String toCSV() {
        return "MOTOR;" +super.toCSV()+ ";" + kategoria + "\n";
    }
}
