package com.designpatterns.bridge.Refactored;

import com.designpatterns.bridge.Refactored.Motors.*;
import com.designpatterns.bridge.Refactored.Vehicles.*;

public class Refactored {
    public static void run() {
        // Petrol car
        System.out.println("\nPetrol car:");
        Vehicle petrolCar = new Car(new PetrolEngine());
        petrolCar.start();
        petrolCar.drive(50);
        petrolCar.steer(DIRECTION.LEFT);

        // Petrol motorbike
        System.out.println("\nPetrol motorbike:");
        Vehicle petrolMotorbike = new Motorbike(new PetrolEngine());
        petrolMotorbike.start();
        petrolMotorbike.drive(50);
        petrolMotorbike.steer(DIRECTION.LEFT);

        // Electric car
        System.out.println("\nElectric car:");
        Vehicle electricCar = new Car(new ElectricMotor());
        electricCar.start();
        electricCar.drive(100.5);
        electricCar.steer(DIRECTION.RIGHT);

        // Electric motorbike
        System.out.println("\nElectric motorbike:");
        Vehicle electricMotorbike = new Motorbike(new ElectricMotor());
        electricMotorbike.start();
        electricMotorbike.drive(100.5);
        electricMotorbike.steer(DIRECTION.RIGHT);
    }
}
