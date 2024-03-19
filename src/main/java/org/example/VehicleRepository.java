package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class VehicleRepository implements IVehicleRepository{

    public VehicleRepository() {
        list = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = reader.readLine()) != null) {
               String[] parts = line.split(";"); // Załóżmy, że dane są oddzielone przecinkami
                if (parts[0].equals("CAR")){
                    Car car = new Car();
                    car.brand = parts[1];
                    car.model = parts[2];
                    car.year = Integer.parseInt(parts[3]);
                    //car.year = parts[3];
                    car.price = Integer.parseInt(parts[4]);
                    car.rejstracja = parts[5];
                    //car.rented = Integer.parseInt(parts[6]) == 1; // Zrzutowanie na typ boolean
                    car.rented = Boolean.parseBoolean(parts[6]);
                    //car.rented = true;
                    list.add(car);

                }
                if (parts[0].equals("MOTOR")){
                    Motorcycle motorcycle = new Motorcycle();
                    motorcycle.brand = parts[1];
                    motorcycle.model = parts[2];
                    motorcycle.year = Integer.parseInt(parts[3]);
                    //car.year = parts[3];
                    motorcycle.price = Integer.parseInt(parts[4]);
                    motorcycle.rejstracja = parts[5];
                    //motorcycle.rented = Integer.parseInt(parts[6]) == 1; // Zrzutowanie na typ boolean
                    //motorcycle.rented = true;
                    motorcycle.rented = Boolean.parseBoolean(parts[6]);

                    motorcycle.kategoria = parts[7];

                    list.add(motorcycle);
                }
                //list.add(vehicle);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    List<Vehicle> list;
    //String path = "C:\\Users\\student\\Desktop\\wkSpring\\untitled\\src\\data.txt";
    //String path = "data.txt";
    String path = "C:\\Users\\student\\Desktop\\wkSpring\\untitled\\src\\main\\java\\org\\example\\data.txt";

    @Override
    public void addVehice(Vehicle vehicleToAdd){// NIEPRZETESTOWANE     NIEPRZETESTOWANE     NIEPRZETESTOWANE     NIEPRZETESTOWANE     NIEPRZETESTOWANE
        for (Vehicle vehicle : list) {
            if (vehicle.rejstracja.equals(vehicleToAdd.rejstracja)){
                System.out.println("Samochod: " + vehicleToAdd.rejstracja + " juz istnieje! ");
                return;
            }
        }
        list.add(vehicleToAdd);

    }

    @Override
    public void removeVehicle(Vehicle vehicleToAdd) {// NIEPRZETESTOWANE     NIEPRZETESTOWANE     NIEPRZETESTOWANE     NIEPRZETESTOWANE     NIEPRZETESTOWANE
        for (Vehicle vehicle : list) {
            if (vehicle.rejstracja.equals(vehicleToAdd.rejstracja)){
                list.remove(vehicle);
                return;
            }
        }
        System.out.println("Takiego samochodu nie bylo! ");

    }

    @Override
    public void rentCar(String plate) {// for each szukamy rejestracje // w parametrze podajemy tablice / plate
        //vehicle.rented = false;
        for (Vehicle vehicle : list) {
            if (vehicle.rejstracja.equals(plate)){
                if (vehicle.rented == true) System.out.println("Samochod jest juz wypozyczony! ");
                else vehicle.rented = true;
                return;
            }

        }
    }

    @Override
    public void returnCar(String plate) {
        for (Vehicle vehicle : list) {
            if (vehicle.rejstracja.equals(plate)){
                //if not rented
                if (vehicle.rented == false) System.out.printf("Samochod nie byl wypozyczony \n");
                else vehicle.rented = false;
                return;
            }

        }
    }


    @Override
    public void getVehicles() {
        for (Vehicle vehicle : list) {
            System.out.println(vehicle.toString());
        }
    }

    @Override
    public void save() {
        //BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        //    writer.write(str);
        //
        //    writer.close();
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path));
            for (Vehicle vehicle : list) {
                //System.out.println(vehicle.toCSV());
                writer.write(vehicle.toCSV());
                //vehicle.toCSV();

            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
