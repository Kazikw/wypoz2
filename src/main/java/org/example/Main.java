package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        System.out.printf("Hello and welcome!");
        VehicleRepository vehicleRepository = new VehicleRepository();
        //System.out.println(vehicleRepository.getVehicles());
        vehicleRepository.getVehicles();
        //vehicleRepository.getVehicles();
        vehicleRepository.rentCar("ABC123");
        vehicleRepository.rentCar("ABC123");
        vehicleRepository.returnCar("ABC123");
        vehicleRepository.returnCar("ABC123");
        vehicleRepository.getVehicles();
        vehicleRepository.save();
    }
}