package org.example;

public interface IVehicleRepository {

    void addVehice(Vehicle vehicleToAdd);
    void removeVehicle(Vehicle vehicleToAdd);
    void rentCar(String plate);
    void returnCar(String plate);
    void getVehicles();
    void save();

}
