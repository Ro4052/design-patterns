package com.designpatterns.bridge.Original;

import com.designpatterns.bridge.Original.Vehicles.*;

public class Original {
    public static void run() {
        // Petrol car
        System.out.println("\nPetrol car:");
        PetrolCar petrolCar = new PetrolCar();
        petrolCar.start();
        petrolCar.drive(50);
        petrolCar.steer(DIRECTION.LEFT);

        // Petrol motorbike
        System.out.println("\nPetrol motorbike:");
        PetrolMotorbike petrolMotorbike = new PetrolMotorbike();
        petrolMotorbike.start();
        petrolMotorbike.drive(50);
        petrolMotorbike.steer(DIRECTION.LEFT);

        // Electric car
        System.out.println("\nElectric car:");
        ElectricCar electricCar = new ElectricCar();
        electricCar.start();
        electricCar.drive(100.5);
        electricCar.steer(DIRECTION.RIGHT);

        // Electric motorbike
        System.out.println("\nElectric motorbike:");
        ElectricMotorbike electricMotorbike = new ElectricMotorbike();
        electricMotorbike.start();
        electricMotorbike.drive(100.5);
        electricMotorbike.steer(DIRECTION.RIGHT);
    }
}
