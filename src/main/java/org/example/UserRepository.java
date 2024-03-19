package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserRepository implements IUserRepository{

    List<String> listOfUsers;
    String pathToUsersCsv = "C:\\Users\\student\\Desktop\\wkSpring\\untitled\\src\\main\\java\\org\\example\\Users.txt";
    public UserRepository(){
        listOfUsers = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(pathToUsersCsv));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";"); // Załóżmy, że dane są oddzielone przecinkami
                if (parts[0].equals("CAR")){//    oznaczenie np user DOSTOSOWAC      DOSTOSOWAC      DOSTOSOWAC      DOSTOSOWAC
                    //User user = new User();
                    //user.login = parts[1];//1 bo 0 oznacza role admin/user
                    String tempUser = parts[1];
                    listOfUsers.add(tempUser);

                }
                if (parts[0].equals("MOTOR")){
/*                    Motorcycle motorcycle = new Motorcycle();
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

                    list.add(motorcycle);*/
                    // nie przewiduje innej opcji
                }
                //list.add(vehicle);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public User getUser(String login) {
        for(Vehicle vehicle: login)///      TU ZACZAC HERE START:

        return void;
    }

    @Override
    public void Save() {

    }

    @Override
    public User getUsers() {
        return null;
    }
}

//  Authentication
