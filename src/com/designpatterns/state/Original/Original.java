package com.designpatterns.state.Original;

public class Original {
    public static void run() {
        System.out.println("");

        // Create a parking meter
        SimpleParkingMeter parkingMeter = new SimpleParkingMeter();

        // Buy a ticket
        parkingMeter.insert50p();
        parkingMeter.insert1Pound();
        parkingMeter.print();

        // Ejecting
        System.out.println("");
        parkingMeter.eject();
        parkingMeter.insert1Pound();
        parkingMeter.eject();

        // Buy another ticket (exact amount)
        System.out.println("");
        parkingMeter.insert50p();
        parkingMeter.insert50p();
        parkingMeter.print();
    }
}
